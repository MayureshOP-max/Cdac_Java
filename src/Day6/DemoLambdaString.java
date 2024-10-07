package Day6;

public class DemoLambdaString {
    public String operateOnString(StringFunction f, String s){
        return f.apply(s);
    }

    public static void main(String[] args)
    {
        DemoLambdaString s = new DemoLambdaString();
        String upper = s.operateOnString((n) -> n.toUpperCase(),"Lambda");
        System.out.println(upper);

        String reverse = s.operateOnString((n) -> {
            String rev = "";
            for(int i = n.length()-1; i >= 0; i--) {
                rev += n.charAt(i);
            }
            return rev;

        },"Lambda");
        System.out.println(reverse);
    }

}
