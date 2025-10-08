package com.murilosantostelles.maratonajava.javacore.ZZDstreams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest09 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,50).filter(numero -> numero%2 == 0).forEach(n -> System.out.println(n + ""));

        System.out.println("============");
        int num [] = {1,2,3,4,5};
        Arrays.stream(num)
                .average()
                .ifPresent(System.out::println);

        System.out.println("===========");

        // usando streams em FILE

        try(Stream<String> lines = Files.lines(Paths.get("file.txt"))){
            lines.filter(l -> l.contains("Java")).forEach(System.out::println); // filtrou a imprimiu apenas as linhas da file que tem a palavra "Java"!
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
