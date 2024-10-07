package day3;

public class DemoString {
    public static void main(String[] args) {
        String s = "Java";
        String s1 = "Java";

        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());

//        s = s+ " 11";
//        System.out.println(s.hashCode());

        String n1 = new String("Hello");
        String n2 = new String("Hello");

        if (s == s1)
            System.out.println("strings are equal");
        else
            System.out.println("not equal");

        System.out.println(n1.hashCode());
        System.out.println(n2.hashCode());

        if (n1.equals(n2))
            System.out.println("strings are equal");
        else
            System.out.println("not equal");

//        if (n1.equals(n2))
        System.out.println(n1.concat(n2));

        n1 = n1.concat(" World");
        System.out.println(n1);


    }
}
