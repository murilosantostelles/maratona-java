package com.murilosantostelles.maratonajava.javacore.Bintroducaometodos.test;

import com.murilosantostelles.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class Pessoatest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Jiraya"); // antes era pessoa.nome = "Jiraya";
        pessoa.setIdade(70);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
