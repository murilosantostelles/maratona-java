package com.murilosantostelles.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    public Anime() {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
        for(int episodio:this.episodios){
            System.out.print(episodio+" ");
        }
    }
}
