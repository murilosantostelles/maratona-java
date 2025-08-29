package com.murilosantostelles.maratonajava.javacore.Npolimorfismo.dominio;

public class Computador extends Produto{

    public static final double IMPOSTO_POR_CENTO = 0.21;

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto de "+this.nome);
        double imposto = this.valor * IMPOSTO_POR_CENTO;
        return imposto;
    }


}
