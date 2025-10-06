package com.murilosantostelles.maratonajava.javacore.ZZCoptional.repositorio;

import com.murilosantostelles.maratonajava.javacore.ZZCoptional.dominio.Manga;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Spliterator;
import java.util.function.Predicate;

public class MangaRepositorio {
    private static List<Manga> mangas = List.of(new Manga(1 , "Boku no hero" , 50), new Manga(2 , "Overlord" , 25) );

    private static Optional<Manga> findBy (Predicate<Manga> predicate){
        Manga found = null;
        for (Manga manga : mangas) {
            if(predicate.test(manga)){
                found = manga;
            }
        }
        return Optional.ofNullable(found);
    }

    public Optional<Manga> findByTitle(String title){
        return findBy(m -> m.getTitle().equals(title));
    }

    public Optional<Manga> findById(Integer id){
        return findBy(m -> m.getId().equals(id));
    }
}
