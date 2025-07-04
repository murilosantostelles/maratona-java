package com.murilosantostelles.maratonajava.javacore.Csobrecargametodos.test;

import com.murilosantostelles.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        //anime.init("Vinland Saga" , "TV" , 74);
        anime.init("Vinland Saga" , "TV" , 74, "Seinen");
        anime.imprime();
    }
}
