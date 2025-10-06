package com.murilosantostelles.maratonajava.javacore.ZZBlambdas.test;

import com.murilosantostelles.maratonajava.javacore.ZZBlambdas.dominio.Anime;
import com.murilosantostelles.maratonajava.javacore.ZZBlambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

// referencia para um construtor
public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> animeComparatorsSupplier = AnimeComparators::new;
        AnimeComparators animeComparators = animeComparatorsSupplier.get();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One piece", 900), new Anime("Naruto", 500)));

        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);


        BiFunction<String, Integer, Anime> animeBiFunction = (title,episodes) -> new Anime(title,episodes); // lambda
        BiFunction<String, Integer, Anime> animeBiFunction2 = Anime::new; // method reference
        System.out.println(animeBiFunction2.apply("Supercampeoes" , 36));
    }
}
