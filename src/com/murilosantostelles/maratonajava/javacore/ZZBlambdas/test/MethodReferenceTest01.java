package com.murilosantostelles.maratonajava.javacore.ZZBlambdas.test;

import com.murilosantostelles.maratonajava.javacore.ZZBlambdas.dominio.Anime;
import com.murilosantostelles.maratonajava.javacore.ZZBlambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One piece", 900), new Anime("Naruto", 500)));
        //Collections.sort(animeList, (a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));

        Collections.sort(animeList, AnimeComparators::compareByTitle);
        Collections.sort(animeList, AnimeComparators::compareByEpisodes);


        System.out.println(animeList);
    }
}
