package com.murilosantostelles.maratonajava.javacore.Rdates.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        



        System.out.println(calendar); // forma não formatada.

        System.out.println("------------------");

        if(calendar.getFirstDayOfWeek() == calendar.SUNDAY){
            System.out.println("Domingo é o primeiro dia da semana");
        }

        System.out.println(calendar.get(calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(calendar.DAY_OF_YEAR));

        // alterando data, adicionando dois dias ao dia de hj
        calendar.add(Calendar.DAY_OF_MONTH,2);
        System.out.println("------------------");
        Date date = calendar.getTime();
        System.out.println(date);
    }
}
