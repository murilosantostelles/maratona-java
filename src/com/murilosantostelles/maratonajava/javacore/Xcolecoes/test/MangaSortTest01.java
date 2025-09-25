package com.murilosantostelles.maratonajava.javacore.Xcolecoes.test;

import com.murilosantostelles.maratonajava.javacore.Xcolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.List;

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5,"hellsing ultimate",19.9)); // criando um objeto diretamente do método "add"
        mangas.add(new Manga(1, "Berserk", 9.5));
        mangas.add(new Manga(4, "Pokemon", 3.2));
        mangas.add(new Manga(3, "Attack on titan", 11.20));
        mangas.add(new Manga(2, "Dragon ball Z", 2.99));


    }
}
