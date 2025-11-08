package com.murilosantostelles.maratonajava.javacore.ZZEpadroesdeprojeto.test;

import com.murilosantostelles.maratonajava.javacore.ZZEpadroesdeprojeto.dominio.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person build = new Person.PersonBuilder()
                .firstName("Murilo")
                .lastName("Stelles")
                .username("murilost")
                .email("murilostl@gmail.com")
                .build();
        System.out.println(build);
    }
}