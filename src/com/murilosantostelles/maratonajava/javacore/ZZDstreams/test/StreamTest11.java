package com.murilosantostelles.maratonajava.javacore.ZZDstreams.test;

import com.murilosantostelles.maratonajava.javacore.ZZDstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest11 {
    private static List<LightNovel> lightNovels = new ArrayList<>( List.of(new LightNovel("Tensei Shittara" , 8.99)
            , new LightNovel("Overlord" , 3.99),
            new LightNovel("Violet Evergarden" , 10.99) ,
            new LightNovel("No game no life" , 2.99),
            new LightNovel("Fullmetal Alchemist" , 5.99),
            new LightNovel("Kumo Desuga" , 1.99),
            new LightNovel("Monogatari" , 4.00)
    ));

    public static void main(String[] args) {
        lightNovels.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println); // mostrar max normalmente
        lightNovels.stream().collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))).ifPresent(System.out::println); // mostrar max com stream collector

        System.out.println("==========");
        System.out.println(lightNovels.stream().mapToDouble(LightNovel::getPrice).sum()); // soma normal
        System.out.println(lightNovels.stream().collect(Collectors.summingDouble(LightNovel::getPrice))); // soma com stream collector

        System.out.println("===========");
        DoubleSummaryStatistics collect = lightNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice)); // une tudo feito anteriormente em uma unica linha
        System.out.println(collect);

        String string = lightNovels.stream().map(LightNovel::getTitle).collect(Collectors.joining(", ")); // separa todos os nomes dos objetos por virgula (muito simples e bom de usar)
        System.out.println(string);
    }
}
