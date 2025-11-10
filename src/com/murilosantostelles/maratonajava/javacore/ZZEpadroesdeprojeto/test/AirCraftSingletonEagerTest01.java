package com.murilosantostelles.maratonajava.javacore.ZZEpadroesdeprojeto.test;

import com.murilosantostelles.maratonajava.javacore.ZZEpadroesdeprojeto.dominio.AirCraft;
import com.murilosantostelles.maratonajava.javacore.ZZEpadroesdeprojeto.dominio.AirCraftSingletonEager;

public class AirCraftSingletonEagerTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat (String seat){
        System.out.println(AirCraftSingletonEager.getInstance());
        AirCraftSingletonEager airCraftSingletonEager = AirCraftSingletonEager.getInstance();
        System.out.println(airCraftSingletonEager.bookSeat(seat));
    }
}
