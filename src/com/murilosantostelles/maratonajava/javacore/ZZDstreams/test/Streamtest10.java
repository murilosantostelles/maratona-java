package com.murilosantostelles.maratonajava.javacore.ZZDstreams.test;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class Streamtest10 {
    public static void main(String[] args) {
        Stream.iterate(1, n -> n+ 2)
                .limit(10)
                .forEach(System.out::println);

        System.out.println("-----------");

        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        Stream.generate(() -> threadLocalRandom.nextInt(1,500))
                .limit(90).forEach(System.out::println); // gera 90 numeros aleatorios
    }
}
