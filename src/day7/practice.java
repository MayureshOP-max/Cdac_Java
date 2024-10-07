package day7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class practice {
    public static void main(String[] args) {
        String [] fruits = {"Mango","orange","Grapes","apple","Banana","strawberry","Watermelon"};

        List<String> lst = Arrays.asList(fruits);
//        System.out.println(lst);
        Stream<String> stream = lst.stream();

        List<String> upper = stream.map((n) -> n.toUpperCase()).toList();
        System.out.println(upper);

        stream = lst.stream();
        List<String> lower = stream.map((n) -> n.toLowerCase()).toList();
        System.out.println(lower);
        System.out.println("-----------------------------------------");

        // fruits less than 'n' in ascending order

        stream = lst.stream();
        List<String> lessThanN = stream.filter((n)-> n.compareToIgnoreCase("n") < 0).sorted(String::compareToIgnoreCase).toList();
        System.out.println(lessThanN);


        System.out.println("-----------------------------------------");
        // fruits less than 'n' in descending order

        stream = lst.stream();
        List<String> lessThanR = stream.filter((n)-> n.compareToIgnoreCase("n") < 0).sorted(String::compareToIgnoreCase).toList().reversed();
        System.out.println(lessThanR);

        // Create a list of fruits with uppercase names

//        stream = lst.stream();
//        List<>

    }
}
