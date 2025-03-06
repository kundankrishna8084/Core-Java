package com.jspider.program.src.java8;

import java.time.*;
import java.util.Date;

public class NewDateDemo {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(d1);

        LocalDate d2 = LocalDate.now();
        System.out.println(d2);

        d2=d2.plusDays(3);
        System.out.println(d2);

        d2=d2.plusMonths(3);
        System.out.println(d2);

        d2=d2.plusYears(3);
        System.out.println(d2);

        boolean leapYear = LocalDate.parse("2020-12-22").isLeapYear();
        System.out.println("Leap Year :: " + leapYear);

        boolean before = LocalDate.parse("2021-12-22").isBefore(LocalDate.parse("2022-12-22"));
        System.out.println("Before Date : " + before);

        LocalTime time = LocalTime.now();
        System.out.println(time);
        time = time.plusHours(2);
        System.out.println(time);

        LocalDateTime datetime = LocalDateTime.now();
        System.out.println(datetime);

        Period period = Period.between(LocalDate.parse("2002-08-30"), LocalDate.now());
        System.out.println(period);

        Period between = Period.between(LocalDate.parse("2002-08-30"), LocalDate.now());
        System.out.println(between.getMonths());


        Duration duration = Duration.between(LocalTime.parse("18:00"), LocalTime.now());
        System.out.println(duration);
    }
}


