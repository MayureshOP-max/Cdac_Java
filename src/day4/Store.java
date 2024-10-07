package day4;

import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        Cart cart = new Cart();

        System.out.println("Welcome to Aladeen Express Store, Branch no.2");
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your choice: \n1.Candies (/kg)\n2.Cookies (/dozen)\n3.IceCream(/piece)");
            int choice = sc.nextInt();
            System.out.println("Enter the price:");
            double price = sc.nextDouble();
            System.out.println("Enter the quantity:");
            double quantity = sc.nextDouble();


            switch (choice) {
                case 1:
                    System.out.println("You have selected Candy");
                    System.out.println("Your qty is: " + quantity);
                    Candies c = new Candies("candy", price, quantity);
                    System.out.println(cart.addToCart(c));
                    break;

                case 2:
                    System.out.println("You have selected Cookies");
                    System.out.println("Your qty is: " + quantity);
                    Cookies cookie = new Cookies("cookie", price, quantity);
                    System.out.println(cart.addToCart(cookie));
                    break;

                case 3:
                    System.out.println("You have selected IceCream");
                    System.out.println("Your qty is: " + quantity);
                    IceCream ice = new IceCream("IceCreams", price, quantity);
                    System.out.println(cart.addToCart(ice));
                    break;

            }
            System.out.println("Do you want to buy More items: 'y' or 'n'");
            String con = sc.next();
            if (con.equals("n")) {
                System.out.println("THanks for coming!!");
                System.out.println("Your total items are: " + cart.total);
                break;
            }
        }
    }
}
