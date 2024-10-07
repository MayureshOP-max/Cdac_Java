package day5;

public class Math {
    public static void main(String[] args) {
        try{
            int dividend = Integer.parseInt(args[0]);
            int divisor = Integer.parseInt(args[1]);

            int res = dividend / divisor;
            System.out.println(res);
        }
        catch (ArithmeticException e){
            System.out.println("The divisor cannot be zero");
            e.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Enter 2 values as dividend and divisor");
            System.out.println(e.getMessage());
        }
        catch (NumberFormatException e){
            System.out.println("Enter Integers only");
            System.out.println(e);
        }
    }
}
