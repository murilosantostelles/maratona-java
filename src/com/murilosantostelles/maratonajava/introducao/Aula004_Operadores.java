package com.murilosantostelles.maratonajava.introducao;

public class Aula004_Operadores {
    public static void main(String[] args) {
        // ARITMETICOS
        // + - * /    -> operaodres
        // % -> resto da divisão
        // o + se comporta de maneiras diferentes no java. serve tanto pra somar,
        // quanto pra concatenar strings
        int n1 = 10;
        int n2 = 20;
        int resultado = n1 + n2;
        System.out.println("Resultado: "+resultado);

        // RELACIONAIS(booleanos)
        // < e >        <= e >=          == e !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteVinte = 10 != 20;
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezDiferenteVinte);

        //LÓGICOS
        // and (&&) , or (||) , not (!)

        int idade = 19;
        float salario = 5500F;
        boolean isDentroDaLei = idade > 18 && salario >= 4612; // and usado aqui
        System.out.println("Dentro da lei? "+isDentroDaLei);

        // problema: temos duas contas bancárias e o objetivo é comprar o ps5
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 1000;
        float precoPs5 = 5000F;
        boolean isPlayStationCincoCompravel = valorTotalContaCorrente >= precoPs5 || valorTotalContaPoupanca >= precoPs5;
        System.out.println("PS5 comprável? "+isPlayStationCincoCompravel);

        // ATRIBUIÇÃO
        // = , += , -=, *=, /= , %= , ++, --
        double bonus = 1800;
        bonus += 1000;
        System.out.println(bonus);
    }
}
