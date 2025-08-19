package com.murilosantostelles.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Carro2 {
    private String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimite = 250;

    public Carro2(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Velocidade maxima: "+this.velocidadeMaxima);
        System.out.println("Velocidade Limite:  "+Carro.velocidadeLimite);
    }

    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro2.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite(){
        return Carro2.velocidadeLimite;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
