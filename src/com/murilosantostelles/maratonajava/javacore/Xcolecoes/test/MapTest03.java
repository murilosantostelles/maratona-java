package com.murilosantostelles.maratonajava.javacore.Xcolecoes.test;

import com.murilosantostelles.maratonajava.javacore.Xcolecoes.dominio.Consumidor;
import com.murilosantostelles.maratonajava.javacore.Xcolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor01 = new Consumidor(2L,"William Suane");
        Consumidor consumidor02 = new Consumidor(2L,"DevDojo Academy");

        Manga manga1 = new Manga(5, "hellsing ultimate", 19.9);
        Manga manga2 = new Manga(1, "Berserk", 9.5);
        Manga manga3 = new Manga(4, "Pokemon", 3.2);
        Manga manga4 = new Manga(3, "Attack on titan", 11.20);
        Manga manga5 = new Manga(2, "Dragon ball Z", 2.99);

        // caso consumidor queira comprr mais de um mangá
        List<Manga> mangaCOnsumidorList = List.of(manga1,manga2,manga3);
        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor01, mangaCOnsumidorList);

        for(Map.Entry<Consumidor, List<Manga>> entry: consumidorMangaMap.entrySet()){
            System.out.println(entry.getKey().getNome());
            for (Manga manga : entry.getValue()) {
                System.out.println(manga.getNome());
            }

        }
    }
}
