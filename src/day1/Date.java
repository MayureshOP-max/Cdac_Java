
package day1;
public class Date {
    private int day;
    private String month;
    private int year;

    public Date(int i, String dec, int i1) {
    }

    public Date() {

    }

    //    Date(int day, String month, int year){
//        this.day = day;
//        this.month = month;
//        this.year = year;
//    }
    //method declaration
    public void setDate(int d, String m, int y){
        day = d;
        month = m;
        year = y;
    }

    public void displayDate()
    {
        System.out.println("Date: " + this.day + "/" + this.month + "/" + this.year);
    }
}

