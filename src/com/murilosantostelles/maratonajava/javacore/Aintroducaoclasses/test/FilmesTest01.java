package com.murilosantostelles.maratonajava.javacore.Aintroducaoclasses.test;

import com.murilosantostelles.maratonajava.javacore.Aintroducaoclasses.dominio.Filmes;

public class FilmesTest01 {
    public static void main(String[] args) {
        Filmes filme01 = new Filmes();
        Filmes filme02 = new Filmes();

        filme01.nome = "Toy Story";
        filme01.genero = "Ação e Aventura";
        filme01.ano = 2006;

        filme02.nome = "Se7en: Os Sete Crimes Capitais";
        filme02.genero = "Thriller";
        filme02.ano = 1999;

        System.out.println(filme01.nome);
        System.out.println(filme01.genero);
        System.out.println(filme01.ano);
        System.out.println("---------------");
        System.out.println(filme02.nome);
        System.out.println(filme02.genero);
        System.out.println(filme02.ano);
    }

}
