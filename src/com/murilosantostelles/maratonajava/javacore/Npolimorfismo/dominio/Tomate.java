package com.murilosantostelles.maratonajava.javacore.Npolimorfismo.dominio;

public class Tomate extends Produto{

    public static final double IMPOSTO_POR_CENTO = 0.06;

    private String dataValidade;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    public double calcularImposto() {
        System.out.println("Calculando imposto de "+this.nome);
        double imposto = this.valor * IMPOSTO_POR_CENTO;
        return imposto;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
