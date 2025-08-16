package com.murilosantostelles.maratonajava.javacore.Dconstrutores.dominio;

public class Time {
    private String nome;
    private int trofeus;
    private String melhorJogador;
    private int posicaoNaTabela;

    public Time(String nome, int trofeus){
        this.nome = nome;
        this.trofeus = trofeus;
    }

    public Time(String nome, int trofeus, String melhorJogador){
        this(nome,trofeus);
        this.melhorJogador = melhorJogador;
    }

    public Time(String nome, int trofeus, String melhorJogador, int posicaoNaTabela){
        this(nome,trofeus,melhorJogador);
        this.posicaoNaTabela = posicaoNaTabela;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTrofeus() {
        return trofeus;
    }

    public void setTrofeus(int trofeus) {
        this.trofeus = trofeus;
    }

    public String getMelhorJogador() {
        return melhorJogador;
    }

    public void setMelhorJogador(String melhorJogador) {
        this.melhorJogador = melhorJogador;
    }

    public int getPosicaoNaTabela() {
        return posicaoNaTabela;
    }

    public void setPosicaoNaTabela(int posicaoNaTabela) {
        this.posicaoNaTabela = posicaoNaTabela;
    }
}
