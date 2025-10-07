package com.murilosantostelles.maratonajava.javacore.ZZDstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        List<String> graphicDesigners = List.of("Wildnei Suane" , "Catarina Santos", "Sandy Caarolina");
        List<String> developers = List.of("William" , "David" , "Harrison");
        List<String> estudantes = List.of("Édipo", "Gustavo lima" , "Gustavo Mendes", "Guilherme");
        devdojo.add(graphicDesigners);
        devdojo.add(developers);
        devdojo.add(estudantes);
        for (List<String> people : devdojo) {
            for (String person : people) {
                System.out.println(person);
            }
        }
        System.out.println("----------------");
        // agora fazendo com stream

        devdojo.stream()
                .flatMap(Collection::stream).forEach(System.out::println);

    }
}
