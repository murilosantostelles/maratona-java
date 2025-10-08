package com.murilosantostelles.maratonajava.javacore.ZZDstreams.test;

import com.murilosantostelles.maratonajava.javacore.ZZDstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest08 {
    private static List<LightNovel> lightNovels = new ArrayList<>( List.of(new LightNovel("Tensei Shittara" , 8.99)
            , new LightNovel("Overlord" , 3.99),
            new LightNovel("Violet Evergarden" , 10.99) ,
            new LightNovel("No game no life" , 2.99),
            new LightNovel("Fullmetal Alchemist" , 5.99),
            new LightNovel("Kumo Desuga" , 1.99),
            new LightNovel("Monogatari" , 4.00)
    ));

    public static void main(String[] args) {

        // somando todos acima de 3
        lightNovels.stream()
                .map(LightNovel::getPrice)
                .filter(price -> price > 3)
                .reduce(Double::sum)// pode usar wrapper
                .ifPresent(System.out::println);

    }
}
