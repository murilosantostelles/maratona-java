package com.murilosantostelles.maratonajava.javacore.Dconstrutores.test;

import com.murilosantostelles.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "TV" , 33, "Esporte", "Production IG");
        anime.imprime();
    }
}
