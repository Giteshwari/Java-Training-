package JavaSession24_jdk8;

import java.time.*;

public class DateAndTimeAPI {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();  //print only date yyyy-mm-dd
        System.out.println(localDate);

        //LocalDate localDate1 = LocalDate.of(2000,10,30); //sets the date
        //LocalDate localDate1 = LocalDate.of(2000, Month.OCTOBER,30);  //Month is enum
        LocalDate localDate1 = LocalDate.parse("2000-10-30");
        System.out.println(localDate1);

        LocalDate localDate2 = localDate1.plusDays(2);
        System.out.println("Adding days::" + localDate2);

        System.out.println("Check if leap year or not::" + " " + localDate1 + " " + localDate1.isLeapYear());

        boolean before = LocalDate.parse("2017-03-01").isBefore(LocalDate.parse("2017-02-28"));
        System.out.println("2017-03-01 is before 2017-02-28 or not:: " + before);

        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        System.out.println("Today's day is::" + dayOfWeek);

        int dayOfMonth = LocalDate.now().getDayOfMonth();
        System.out.println("Day of Month:: " + dayOfMonth);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalTime localTime1 = LocalTime.of(12,35,10);
        System.out.println(localTime1);

//        System.out.println("******* ZONE ID *******");
//        for (String s: ZoneId.getAvailableZoneIds()) {
//            System.out.println(s);
//        }
//        System.out.println("********* END ***********");

        LocalTime localTime2 = LocalTime.now(ZoneId.of("Asia/Kuwait"));
        System.out.println("Time in Kuwait::" + localTime2);

        int time = LocalTime.now().getHour();
        System.out.println("Hours right now is::" + time);

        System.out.println("Max time is::" + LocalTime.MAX); //time before midnight
        System.out.println("Max time is::" + LocalTime.MIN); //start of day

        Instant instant = Instant.now();
        System.out.println(instant);  //give GMT time with date it is machine readable

        LocalDateTime localDateTime= LocalDateTime.now();
        System.out.println(localDateTime);


    }
}
/*
Output:
2022-02-21
2000-10-30
Adding days::2000-11-01
Check if leap year or not:: 2000-10-30 true
2017-03-01 is before 2017-02-28 or not:: false
Today's day is::MONDAY
Day of Month:: 21
17:02:14.655
12:35:10
Time in Kuwait::14:32:14.655
Hours right now is::17
Max time is::23:59:59.999999999
Max time is::00:00
2022-02-21T11:32:14.655Z
2022-02-21T17:02:14.655


How it is improved in jdk 8

First it was not Thread safe
The new date-time API is immutable and does not have setter methods.

Poor design − Default Date starts from 1900, month starts from 1,and day starts from 0, so no uniformity.
 The old API had less direct methods for date operations. The new API
 provides numerous utility methods for such operations.

Difficult time zone handling − Developers had to write a lot of code to deal with timezone issues. The new API has been developed keeping
 domain-specific design in mind.

 */