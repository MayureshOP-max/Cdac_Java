package day8_datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.stream.Stream;

public class DemoLocalDate {


    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate diwali = LocalDate.of(2025,11,1);
        System.out.println(diwali);

        Period timetodiwali = today.until(diwali);
        System.out.println(timetodiwali);
        System.out.println(timetodiwali.getYears() + "year(s)"+ timetodiwali.getMonths() + "month(s)"+ timetodiwali.getDays() + "day(s)");

        long daystodiwali = today.until(diwali, ChronoUnit.DAYS);
        System.out.println(daystodiwali+ "day(s)");

        System.out.println(today.getDayOfMonth());
        System.out.println(today.getDayOfWeek());
        System.out.println(today.getMonthValue());
        System.out.println(today.getMonth());
        System.out.println(today.getYear());

        LocalDate tommorrow = today.plusDays(1);
        System.out.println(tommorrow);
        LocalDate nextFriday = today.plus(7,ChronoUnit.DAYS);
        System.out.println(nextFriday);

        System.out.println("_____________________________________________________________________");
        Stream<LocalDate> currentyear = LocalDate.of(2024,1,1).
                datesUntil(LocalDate.of(2025,1,1));

        currentyear.filter((date)->date.getDayOfWeek().equals(DayOfWeek.FRIDAY))
                .filter((date)-> date.getDayOfMonth()==13).forEach(System.out::println);
    }
}




















