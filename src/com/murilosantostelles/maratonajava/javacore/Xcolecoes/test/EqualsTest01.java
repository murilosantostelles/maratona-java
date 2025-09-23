package com.murilosantostelles.maratonajava.javacore.Xcolecoes.test;

public class EqualsTest01 {
    public static void main(String[] args) {
        String nome = "William Suane";
        String nome2 = new String("William Suane");

        System.out.println(nome == nome2); // para comparar o valor de variavel de referência, utiliza-se o .equals
        System.out.println(nome.equals(nome2)); // para comparar o valor de variavel de referência, utiliza-se o .equals

    }
}
