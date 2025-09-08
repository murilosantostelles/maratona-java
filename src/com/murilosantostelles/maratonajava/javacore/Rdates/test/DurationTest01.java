package com.murilosantostelles.maratonajava.javacore.Rdates.test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {
    public static void main(String[] args) {
        // Duração pra horas
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);
        LocalTime timenow = LocalTime.now();
        LocalTime timeMinusSevenHours = LocalTime.now().minusHours(7);
        Duration d1 = Duration.between(now, nowAfterTwoYears);
        Duration d2 = Duration.between(timenow, timeMinusSevenHours);


        System.out.println(Duration.ofDays(20)); // duração de 20 dias
        System.out.println(d1);
        System.out.println(d2);
    }
}
