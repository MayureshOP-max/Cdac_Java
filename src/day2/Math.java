package day2;
import day1.NewDate;
import day1.Date;

import java.util.Arrays;
public class Math
{
    public static int increment(int num)
    {
        num = num +1;
        return num;
    }

    public static void incrementDate(NewDate d)
    {
        int day = d.getDay();
        d.setDay(day+1);
    }

    public static void swapDates(Date d1 , Date d2)
    {
        Date temp = null;
        temp = d1;
        d1 = d2;
        d2 = temp;

    }

    public static void sortArray(int [] arr)
    {
            int n = arr.length;
            for (int i = 0;i<n;i++)
            {
                for (int j = 0;j<n-1;j++)
                {
                    if(arr[j]>arr[j+1])
                    {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }

                }
            }
    }




    public static void main(String[] args) {
        int n = 10;
        System.out.println("Before Increment : "+n);
        n = increment(n);
        System.out.println("After Increment : "+n);


        NewDate d = new NewDate();
        d.setDay(23);
        d.setMonth("Jan");
        d.setYear(2000);

        System.out.println("Before Increment : " +d);
        incrementDate(d);
        System.out.println("After Increment : " +d);

        Date dt1 = new Date(4,"dec",2000);
        Date dt2 = new Date(5,"dec",2000);
        System.out.println("Before swap d1 :" +dt1 + "d2 :" + dt2);
        swapDates(dt1 , dt2);
        System.out.println("After swap d1 :" +dt1 + "d2 :" + dt2);

        int arr [] = {12,34,10,98,75};
        sortArray(arr);
        System.out.println("After Sorting "+ Arrays.toString(arr));


    }
}



