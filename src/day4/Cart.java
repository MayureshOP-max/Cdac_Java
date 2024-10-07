package day4;


public class Cart{
    public static double total;
    public static int items;
    public double addToCart(Dessert d){
        total += d.calculatePrice();
        items+=1;
        System.out.println("Your bought no of items : "+items +" Your total will be: " + total);
        return total;
    }
}
