package day1;

public class Calender {
    public static void main(String[] args) {
        Date d = new Date();
        d.setDate(12, "Dec", 2000);
        d.displayDate();

        NewDate date = new NewDate();
        date.setDay(11);
        date.setMonth("Jan");
        date.setYear(2024);

        System.out.println(date);
    }
}
