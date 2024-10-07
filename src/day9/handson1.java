package day9;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class handson1 {

    public static void main(String[] args) {
        //calculate your age in no. of days months and years
        LocalDate birthDate = LocalDate.of(2002,12,25);
        LocalDate currentDate = LocalDate.now();
        Period  period = Period.between(birthDate, currentDate);

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        Long totalDays = ChronoUnit.DAYS.between(birthDate, currentDate);

        System.out.println("Age:");
        System.out.println("Years: "+years);
        System.out.println("Months: "+months);
        System.out.println("Days: "+days);
        System.out.println("Total days: " + totalDays);

        //compute programmers day without using plusday

        int year = LocalDate.now().getYear();
        LocalDate startOfYear = LocalDate.of(2024,1,1);
        boolean isLeapYear = startOfYear.isLeapYear();
        int programmersDay = isLeapYear ? 256: 256;

        LocalDate date = startOfYear;
        int totalDays1 = 0;

        for (int month = 1; month <= 12; month++) {
            int daysInMonth = date.withMonth(month).lengthOfMonth();

            if (totalDays1 + daysInMonth >= programmersDay) {
                int day = programmersDay - totalDays1;
                date = date.withMonth(month).withDayOfMonth(day);
                break;
            }
        }
        System.out.println("Programmer's Day in year " + year + " is: " + date);

        int year1 = 2024;  // Year to check

        System.out.println("Months in " + year + " that start on a Sunday:");

        // Loop through all the months of the year
        for (int month = 1; month <= 12; month++) {
            // Create a LocalDate object for the 1st day of the current month
            LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);

            // Check if the first day of the month is a Sunday
            if (firstDayOfMonth.getDayOfWeek() == DayOfWeek.SUNDAY) {
                // Print the name of the month that starts on a Sunday
                System.out.println(firstDayOfMonth.getMonth());
            }
        }

        // Define the time zones for Mumbai and New York
        ZoneId mumbaiZone = ZoneId.of("Asia/Kolkata");  // Mumbai Time Zone (IST)
        ZoneId newYorkZone = ZoneId.of("America/New_York");  // New York Time Zone (EDT)

        // Define departure and arrival times (LocalDateTime, without time zone)
        LocalDateTime departureTime = LocalDateTime.of(2024, 10, 7, 2, 5);  // 2:05 AM on 7th Oct 2024
        LocalDateTime arrivalTime = LocalDateTime.of(2024, 10, 7, 16, 40);  // 4:40 PM on 7th Oct 2024

        // Create ZonedDateTime objects with the respective time zones
        ZonedDateTime departureInMumbai = ZonedDateTime.of(departureTime, mumbaiZone);
        ZonedDateTime arrivalInNewYork = ZonedDateTime.of(arrivalTime, newYorkZone);

        // Calculate the flight duration
        Duration flightDuration = Duration.between(departureInMumbai, arrivalInNewYork);

        // Get the total hours and minutes of the duration
        long hours = flightDuration.toHours();
        long minutes = flightDuration.toMinutes() % 60;

        // Print the flight duration
        System.out.println("Flight duration is: " + hours + " hours and " + minutes + " minutes.");
        


    }
}
