package com.murilosantostelles.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
    public void imprimir(Estudante estudante){

        // Quando passamos parametro por referência, nós estamos passando a propria referêcia, e não uma cópia.

        System.out.println("----------------");

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
