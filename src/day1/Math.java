package day1;
public class Math{
    static double PI;

    public static int factorial(int n){
        int result = 1;
        for (int i = 1;i<=n;i++) {
            result *= i;
        }
        return result;

    }
    public static boolean isPrime(int n){
        for (int i =2; i<n; i++){
            if(n%i == 0)
                return false;
        }
        return true;
    }

    public int add(int s, int b){
        return s+b;
    }

    public static void main (String[] args){
        Math m = new Math();
        int result = m.factorial(5);
        System.out.println(result);
        System.out.println(m.isPrime(13));
        System.out.println(PI);

    }

}