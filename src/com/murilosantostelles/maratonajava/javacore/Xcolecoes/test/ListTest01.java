package com.murilosantostelles.maratonajava.javacore.Xcolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(); // um array que pode ser dinamicamente incrementado
        nomes.add("William");
        nomes.add("DevDojo");

        for (Object nome : nomes) {
            System.out.println(nome);
        }
        System.out.println("----------");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

    }
}
