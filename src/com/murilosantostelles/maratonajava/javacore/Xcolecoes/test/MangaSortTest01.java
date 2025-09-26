package com.murilosantostelles.maratonajava.javacore.Xcolecoes.test;

import com.murilosantostelles.maratonajava.javacore.Xcolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByNameComparator implements Comparator<Manga>{
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getNome().compareTo(manga2.getNome());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5,"hellsing ultimate",19.9)); // criando um objeto diretamente do método "add"
        mangas.add(new Manga(1, "Berserk", 9.5));
        mangas.add(new Manga(4, "Pokemon", 3.2));
        mangas.add(new Manga(3, "Attack on titan", 11.20));
        mangas.add(new Manga(2, "Dragon ball Z", 2.99));


        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Collections.sort(mangas);
        System.out.println("-----------");

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Collections.sort(mangas, new MangaByNameComparator());
        System.out.println("-----------");

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
