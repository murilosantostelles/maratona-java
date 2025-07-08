package com.murilosantostelles.maratonajava.javacore.Dconstrutores.test;

import com.murilosantostelles.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "TV" , 33, "Esporte");
        Anime anime2 = new Anime();


        //anime.init("Vinland Saga" , "TV" , 74);
        //anime.init("Vinland Saga" , "TV" , 74, "Seinen");
        anime.imprime();
        anime2.imprime();
    }
}
