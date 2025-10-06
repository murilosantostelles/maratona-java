package com.murilosantostelles.maratonajava.javacore.ZZBlambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        List<String> strings = List.of("Natsu", "Allucard");

        List<Integer> integers = map(strings, String::length); // troca a lambda pelo method reference
        List<String> upper = map(strings, s -> s.toUpperCase());

        System.out.println(integers);
        System.out.println(upper);
    }
    private static <T, R> List<R> map(List<T> list, Function<T, R> function){
        List<R> result = new ArrayList<>();
        for (T t : list) {
            R r = function.apply(t);
            result.add(r);
        }
        return result;
    }
}
