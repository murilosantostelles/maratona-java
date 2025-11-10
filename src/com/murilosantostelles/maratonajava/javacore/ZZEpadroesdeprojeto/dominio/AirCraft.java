package com.murilosantostelles.maratonajava.javacore.ZZEpadroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public class AirCraft {
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    public AirCraft(String name) {
        this.name = name;
    }

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    public boolean bookSeat(String seat){
        return availableSeats.remove(seat);
    }
}
