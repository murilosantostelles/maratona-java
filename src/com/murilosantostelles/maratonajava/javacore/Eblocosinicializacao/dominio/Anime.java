package com.murilosantostelles.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;
    // Ordem:
    // 1 - Alocado espaço em memoria pro objeto
    // 2- Cada atributo da classe é criado e inicializado com valores default ou o quer for passada
    // 3 - Bloco de Inicialização é executado
    // 4- Construtor é executado.
    // Diferença entre bloco de inicialização e construtor:
    // o bloco é executado independente do construtor que vc chamar


    {
        System.out.println("Dentro do Bloco de Inicialização");
        episodios = new int [100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime(int[] episodios) {
        this.episodios = episodios;
    }

    public Anime() {
        episodios = new int[100];

        for(int episodio:this.episodios){
            System.out.print(episodio+" ");
        }
        System.out.println(" ");
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
