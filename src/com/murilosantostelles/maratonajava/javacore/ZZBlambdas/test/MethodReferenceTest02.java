package com.murilosantostelles.maratonajava.javacore.ZZBlambdas.test;

import com.murilosantostelles.maratonajava.javacore.ZZBlambdas.dominio.Anime;
import com.murilosantostelles.maratonajava.javacore.ZZBlambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One piece", 900), new Anime("Naruto", 500)));

        animeList.sort(animeComparators::compareByEpisodesNonStatic); // chamando atraves de um objeto
        System.out.println(animeList);
    }
}
