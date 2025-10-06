package com.murilosantostelles.maratonajava.javacore.ZZCoptional.test;

import com.murilosantostelles.maratonajava.javacore.ZZCoptional.dominio.Manga;
import com.murilosantostelles.maratonajava.javacore.ZZCoptional.repositorio.MangaRepositorio;

import javax.print.attribute.standard.MediaName;
import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        MangaRepositorio repositorio = new MangaRepositorio();

        Optional<Manga> mangaByTitle = repositorio.findByTitle("Boku no hero");
        mangaByTitle.ifPresent(m -> m.setTitle("Boku no hero 2"));
        System.out.println(mangaByTitle);

        Manga mangaById = repositorio.findById(2)
                .orElseThrow(IllegalArgumentException::new);

        System.out.println(mangaById);


        Manga newManga = repositorio.findByTitle("Drifters")
                .orElseGet(() -> new Manga(3, "Drifters", 20));
        System.out.println(newManga);
    }
}
