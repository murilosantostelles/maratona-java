package com.murilosantostelles.maratonajava.javacore.ZZCoptional.test;

import java.util.List;
import java.util.Locale;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("sim");
        Optional<String> o2 = Optional.ofNullable(null); // cria um optional vazio e não dá nullpointer exception
        System.out.println(o1);
        System.out.println(o2);
        System.out.println("------------");
        Optional<String> nameOptional = findName("William");
        String empty = nameOptional.orElse("EMPTY");
        System.out.println(empty);
        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase(Locale.ROOT)));
    }

    private static Optional<String> findName(String name){
        List<String> names = List.of("William", "DevDojo");
        int i = names.indexOf(name);
        if(i != -1){
            return Optional.of(names.get(i));
        }
        return Optional.empty();
    }
}
