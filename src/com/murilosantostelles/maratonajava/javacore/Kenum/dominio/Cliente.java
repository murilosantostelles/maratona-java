package com.murilosantostelles.maratonajava.javacore.Kenum.dominio;

public class Cliente {
    public enum TipoPagamento{
        DEBITO, CREDITO
    }
    private String nome;
    private TipoCliente tipoCliente; // TEM UM
    private TipoPagamento tipoPagamento;

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoClienteInt=" + tipoCliente.VALOR +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }
}
