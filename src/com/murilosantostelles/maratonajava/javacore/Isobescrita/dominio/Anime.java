package com.murilosantostelles.maratonajava.javacore.Isobescrita.dominio;

public class Anime {
    private String nome;

    @Override
    public String toString() {
        return "Anime{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public void imprime(){
        System.out.println(this.nome);
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
