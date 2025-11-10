package com.murilosantostelles.maratonajava.javacore.ZZEpadroesdeprojeto.test;

import com.murilosantostelles.maratonajava.javacore.ZZEpadroesdeprojeto.dominio.AirCraft;

public class AirCraftTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat (String seat){
        AirCraft airCraft = new AirCraft("787-900");
        System.out.println(airCraft.bookSeat(seat));
    }
}
