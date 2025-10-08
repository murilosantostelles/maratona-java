package com.murilosantostelles.maratonajava.javacore.ZZDstreams.test;

import java.util.List;

public class StreamTest07 {
    public static void main(String[] args) {
        // diferentes formas de somar

        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);

        integers.stream()
                .reduce((x,y) -> x + y)
                .ifPresent(System.out::println);

        System.out.println("----------");
        System.out.println(integers.stream().reduce(0,(x,y) -> x + y));

        System.out.println("------------");

        System.out.println(integers.stream().reduce(0, Integer::sum));

        System.out.println("------------");
        integers.stream().reduce(Integer::sum).ifPresent(System.out::println);


        System.out.println("===============");
        // retorna o maior
        integers.stream().reduce(Integer::max).ifPresent(System.out::println);

        System.out.println("===============");
        // retorna o menor
        integers.stream().reduce(Integer::min).ifPresent(System.out::println);
    }
}
