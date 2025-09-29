package com.murilosantostelles.maratonajava.javacore.Xcolecoes.test;

import com.murilosantostelles.maratonajava.javacore.Xcolecoes.dominio.Manga;
import com.murilosantostelles.maratonajava.javacore.Xcolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;


class SmartphoneMarcaComparator implements Comparator<Smartphone>{

    @Override
    public int compare(Smartphone smartphone, Smartphone t1) {
        return smartphone.getMarca().compareTo(t1.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga manga, Manga t1) {
        return Double.compare(manga.getPreco(),t1.getPreco());
    }
}
public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(5L,"hellsing ultimate",19.9, 0)); // criando um objeto diretamente do método "add"
        mangas.add(new Manga(1L, "Berserk", 9.5, 5));
        mangas.add(new Manga(4L, "Pokemon", 3.2, 0));
        mangas.add(new Manga(3L, "Attack on titan", 11.20, 2));
        mangas.add(new Manga(2L, "Dragon ball Z", 2.99, 0));
        mangas.add(new Manga(2L, "Dragon ball Z", 2.99, 0)); // o HashSet não adiciona elementos duplicados

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        // o TreeSet vai automaticamente fazer a organização da sua coleção baseado no compareTo() da classe! No caso está ordennado po id 1 -> 5, pois o compare to se baseia no id


        System.out.println("---------------");
        for (Manga manga : mangas.descendingSet()) { // ordem descrescente
            System.out.println(manga);
        }


        // metodos de comparação interessantes:
        // lower: vai trazer o objeto que é imdiatamente menor do que o valor q vc passa
        // floor: vai trazer o mesmo valor que vc passa <=
        // higher: vai trazer o objeto que é imediatamente maior do que o valor q vc passa
        // ceiling: vai trazer o mesmo valor que vc passa >=
    }
}
