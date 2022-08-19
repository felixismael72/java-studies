package com.studies.javaoneforall.utility.date.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        if (calendar.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Sunday is the first day of the week");
        }
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        Date date = calendar.getTime();
        System.out.println(date);
    }
}
