package day5_collection;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class DemoList {
    public static void main(String[] args) {
        List lst = new ArrayList<>();
        lst.add(120);
        lst.add("test");
        lst.add(true);
        lst.add(12.3f);
        for (Object o : lst)
        {
            System.out.println(o);
        }
        lst.remove("test");
        for (Object o : lst)
        {
            System.out.println(o);
        }


        Iterator it = lst.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        for (Object o : lst)
        {
            int i = (Integer)o;
            System.out.println(i++);
        }

    }
}
