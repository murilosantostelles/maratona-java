package com.murilosantostelles.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    // Acoplamento
    private String nome; // colocar private significa que esses atributos só podem ser acessados pelo objeto. Fora daqui não dá pra acessar
    private int idade;


    //                               SET -> leva pro original em memória
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

    //                                         GET -> pega oq foi setado no original em memoria

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }
}
