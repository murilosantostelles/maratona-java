package com.murilosantostelles.maratonajava.javacore.ZZDstreams.test;

import com.murilosantostelles.maratonajava.javacore.ZZDstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {
    private static List<LightNovel> lightNovels = new ArrayList<>( List.of(new LightNovel("Tensei Shittara" , 8.99)
            , new LightNovel("Overlord" , 3.99),
            new LightNovel("Violet Evergarden" , 10.99) ,
            new LightNovel("No game no life" , 2.99),
            new LightNovel("Fullmetal Alchemist" , 5.99),
            new LightNovel("Kumo Desuga" , 1.99),
            new LightNovel("Monogatari" , 4.00)
    ));
    public static void main(String[] args) {
        System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPrice() > 9)); // ve se tem algum com preço maior que 9
        System.out.println(lightNovels.stream().allMatch(ln -> ln.getPrice() > 0)); // confere se todos tem preço maior que zero
        System.out.println(lightNovels.stream().noneMatch(ln -> ln.getPrice() > 0)); // retorna se nenhum é maior que zero
        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .findAny() // imprime qualquer um com preço maior que 3
                .ifPresent(System.out::println);

        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .sorted(Comparator.comparing(LightNovel::getPrice))
                .findFirst()
                .ifPresent(System.out::println);
    }
}
