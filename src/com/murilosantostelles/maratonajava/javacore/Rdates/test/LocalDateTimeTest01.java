package com.murilosantostelles.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        // junção de LocalDate e LocalTime
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime);
        System.out.println(localDateTime.getDayOfWeek());
    }
}
