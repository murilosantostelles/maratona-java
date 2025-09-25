package com.murilosantostelles.maratonajava.javacore.Xcolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>();
        mangas.add("Attack on titan");
        mangas.add("Berserk");
        mangas.add("Hellsing Ultimate");
        mangas.add("Pokemon");
        mangas.add("Dragon Ball Z");
        Collections.sort(mangas);



        for (String manga : mangas) {
            System.out.println(manga);
        }

    }
}
