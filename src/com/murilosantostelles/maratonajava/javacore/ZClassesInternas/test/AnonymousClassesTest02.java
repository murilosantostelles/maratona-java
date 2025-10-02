package com.murilosantostelles.maratonajava.javacore.ZClassesInternas.test;

import com.murilosantostelles.maratonajava.javacore.YGenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnonymousClassesTest02 {
    public static void main(String[] args) {
        List<Barco> barcos = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

        barcos.sort(new Comparator<Barco>() {
            @Override
            public int compare(Barco barco, Barco barco2) {
                return barco.getNome().compareTo(barco2.getNome());
            }
        });
        System.out.println(barcos);
    }
}
