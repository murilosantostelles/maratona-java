package com.murilosantostelles.maratonajava.javacore.Eblocosinicializacao.test;

import com.murilosantostelles.maratonajava.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece");

        for (int episodio : anime.getEpisodios()) {
            System.out.println(episodio+" ");
        }

    }
}
