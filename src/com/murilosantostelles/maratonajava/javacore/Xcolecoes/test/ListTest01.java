package com.murilosantostelles.maratonajava.javacore.Xcolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(); // um array que pode ser dinamicamente incrementado
        List<String> nomes2 = new ArrayList<>(); // um array que pode ser dinamicamente incrementado
        nomes.add("William");
        nomes.add("DevDojo");
        nomes2.add("Suane");
        nomes2.add("Academy");

        nomes.addAll(nomes2);

        for (Object nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("----------");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }
}
