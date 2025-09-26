package com.murilosantostelles.maratonajava.javacore.Xcolecoes.test;

import com.murilosantostelles.maratonajava.javacore.Xcolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        // forma de remover um mangá da lista usando o Iterator
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L,"hellsing ultimate",19.9, 0)); // criando um objeto diretamente do método "add"
        mangas.add(new Manga(1L, "Berserk", 9.5, 5));
        mangas.add(new Manga(4L, "Pokemon", 3.2, 0));
        mangas.add(new Manga(3L, "Attack on titan", 11.20, 2));
        mangas.add(new Manga(2L, "Dragon ball Z", 2.99, 0));


        Iterator<Manga> mangaIterator = mangas.iterator();
        while (mangaIterator.hasNext()){
            Manga manga = mangaIterator.next();
            if(manga.getQuantidade() == 0){
                mangaIterator.remove();
            }
        }
        System.out.println(mangas);

        System.out.println("--------------");

        mangas.removeIf(manga -> manga.getQuantidade() == 0); // navega por todos os mangás, e remove se algum mangá tiver quantidade igual a zero.
        System.out.println(mangas);

        // os dois jeitos fazem a mesma coisa (o segundo é programação funcional)
    }
}
