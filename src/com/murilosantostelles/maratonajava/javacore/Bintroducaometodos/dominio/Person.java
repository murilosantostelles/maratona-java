package com.murilosantostelles.maratonajava.javacore.Bintroducaometodos.dominio;

public class Person {
    private String nome;
    private int idade;

    public void imprimirDados(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    public String getNome(){
        return this.nome;
    }
    public int getidade(){
        return this.idade;
    }
}
