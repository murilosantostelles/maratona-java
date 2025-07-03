package com.murilosantostelles.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    // Acoplamento
    private String nome; // colocar private significa que esses atributos só podem ser acessados pelo objeto. Fora daqui não dá pra acessar
    private int idade;

    public void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    //                               SET
    public void setNome(String nome){ // mETODO publico pra acessar os atributos privados.
        this.nome = nome;
    }

    public void setIdade(int idade){
        if (idade < 0){
            System.out.println("Idade Invalida.");
            return;
        }
        this.idade = idade;
    }

    //                                         GET

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }
}
