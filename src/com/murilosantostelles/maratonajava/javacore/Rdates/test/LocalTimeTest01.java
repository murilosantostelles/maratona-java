package com.murilosantostelles.maratonajava.javacore.Rdates.test;

import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(18,50,00); // escrever em forma de horario, o horario que eu quiser
        LocalTime timeNow = LocalTime.now();

        System.out.println(time);
        System.out.println(timeNow);

    }
}
