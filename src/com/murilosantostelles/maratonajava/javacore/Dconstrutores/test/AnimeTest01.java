package com.murilosantostelles.maratonajava.javacore.Dconstrutores.test;

import com.murilosantostelles.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "TV" , 33, "Esporte", "Production IG"); //Construtor nada mais é do que um método de inicialização
        // que fica representado no parenteses acima.
        anime.imprime();
    }
}
