package com.murilosantostelles.maratonajava.javacore.Xcolecoes.test;

import com.murilosantostelles.maratonajava.javacore.Xcolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(5L,"hellsing ultimate",19.9, 0)); // criando um objeto diretamente do método "add"
        mangas.add(new Manga(1L, "Berserk", 9.5, 5));
        mangas.add(new Manga(4L, "Pokemon", 3.2, 0));
        mangas.add(new Manga(3L, "Attack on titan", 11.20, 2));
        mangas.add(new Manga(2L, "Dragon ball Z", 2.99, 0));
        mangas.add(new Manga(2L, "Dragon ball Z", 2.99, 0)); // o HashSet não adiciona elementos duplicados

        // se quiser escrever na ordem de inserção acima, basta usar o LinkedHashSet ao invés do HashSet

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
