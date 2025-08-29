package com.murilosantostelles.maratonajava.javacore.Npolimorfismo.dominio;

public class Tomate extends Produto{

    public static final double IMPOSTO_POR_CENTO = 0.06;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    public double calcularImposto() {
        System.out.println("Calculando imposto de "+this.nome);
        double imposto = this.valor * IMPOSTO_POR_CENTO;
        return imposto;
    }
}
