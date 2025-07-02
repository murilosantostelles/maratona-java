package com.murilosantostelles.maratonajava.javacore.Bintroducaometodos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    public void imprimir(){
        System.out.println("------------");
        System.out.println(this.nome); // Assim já imprime, sem precisar da classe impressora.
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
