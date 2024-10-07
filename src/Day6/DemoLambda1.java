package Day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoLambda1 {
    public boolean operateOnNum(Predicate p, int n){
        return p.test(n);
    }
    public List<Integer> operateOneNum(Predicate p, List<Integer> n)
    {
        List<Integer> filtered = new ArrayList<>();
        for (Integer i : n) {
            if(p.test(i)){
                filtered.add(i);
            }
        }
        return filtered;

    }

    public static void main(String[] args)
    {
        Integer[] nums = {12, -13, 14, -15, 16, 17, -18, 19, 20};
        List<Integer> vals = Arrays.asList(nums);
        DemoLambda1 demo = new DemoLambda1();
        boolean ispositive = demo.operateOnNum(n -> n > 0, 12);
        System.out.println(ispositive);
        List<Integer> positives = demo.operateOneNum(n -> n > 0, vals);
        System.out.println(positives);
    }
}
