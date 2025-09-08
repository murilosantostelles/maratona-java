package com.murilosantostelles.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {
        //periodos pra datas
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(7);
        Period p1 = Period.between(now , nowAfterTwoYears); // só aceita localDate

        Period p2 = Period.ofWeeks(325);


        System.out.println(p1);
        System.out.println(p2);
    }
}
