package com.murilosantostelles.maratonajava.javacore.Csobrecargametodos.test;

import com.murilosantostelles.maratonajava.javacore.Csobrecargametodos.dominio.Anime2;

public class AnimeTest02 {
    public static void main(String[] args) {
        Anime2 anime = new Anime2();

        anime.init("Shingeki" , "tv" , 70, "shonen");
        System.out.println(anime.getNome());
        System.out.println(anime.getTipo());
        System.out.println(anime.getEpisodios());
        System.out.println(anime.getGenero());
    }
}
