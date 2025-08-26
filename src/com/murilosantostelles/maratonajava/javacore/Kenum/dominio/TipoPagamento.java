package com.murilosantostelles.maratonajava.javacore.Kenum.dominio;

public enum TipoPagamento{
    DEBITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1; // dentro do debito, eu to sobescrevrendo o calcularDesconto, que foi declarado fora
        }
    }, CREDITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };

    public double calcularDesconto(double valor){
        return 0;
    }
}
