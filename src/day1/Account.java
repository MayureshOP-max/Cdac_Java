package day1;

public class Account {

    private int accid;
    private String name;

    private static float intrate ;

    static{
        System.out.println("Static block 1");
        intrate = 6.5f;

    }

    static{
        System.out.println("Static block 2");
    }

    public Account()
    {
//        accid = 10000;
//        name = 'aaa';
        this(10000,"aaa");
    }

    public Account(int accid, String name)
    {
        this.accid = accid;
        this.name = name;
    }



    public static void displayInterestRate()
    {
        System.out.println("Current interest rate for account: "+intrate);
    }


}
