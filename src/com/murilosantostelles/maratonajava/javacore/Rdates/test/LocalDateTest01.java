package com.murilosantostelles.maratonajava.javacore.Rdates.test;

import com.murilosantostelles.maratonajava.javacore.Gassociacao.dominio.Local;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class LocalDateTest01 {
    public static void main(String[] args) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        LocalDate ldate = LocalDate.of(2026, Month.MAY,29);
        LocalDate agora = LocalDate.now();

        System.out.println(date);
        System.out.println(calendar);
        System.out.println("--------------");
        System.out.println(ldate.getDayOfWeek());
        System.out.println(ldate.isLeapYear());
        System.out.println(ldate); // imprime do jeito que é salvo no banco de dados
        System.out.println(agora); // imprime do jeito que é salvo no banco de dados (momento AGORA)
    }
}
