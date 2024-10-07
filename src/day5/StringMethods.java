package day5;

public class StringMethods {

    public static String convertToLower(String s) throws EmptyStringException
    {
        if(s=="")
            throw new EmptyStringException("String is Empty");
        else return s.toLowerCase();
    }

    public static void main(String[] args) {
        String s1 = "";
        try{
            String lower = convertToLower(s1);
            System.out.println(lower);
        }
        catch (EmptyStringException e){
            System.out.println(e.getMessage());
        }
    }
}
