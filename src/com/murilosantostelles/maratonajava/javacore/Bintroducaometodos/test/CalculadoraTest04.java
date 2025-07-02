package com.murilosantostelles.maratonajava.javacore.Bintroducaometodos.test;

import com.murilosantostelles.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        // Parâmetros tipo primitivo
        Calculadora calculadora = new Calculadora();
        int numero1 = 29;
        int numero2 = 5;
        calculadora.alteraDoisNumeros(numero1, numero2); // Uma cópia é gerada, mas as variaveis numero1 e numero2 não mudam, pois são a referência (independentes).

        System.out.println(numero1); // numero1 é diferente de n1 de "Calculadora.java" .
        System.out.println(numero2);
    }
}