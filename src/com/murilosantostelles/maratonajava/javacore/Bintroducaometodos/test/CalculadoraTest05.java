package com.murilosantostelles.maratonajava.javacore.Bintroducaometodos.test;

import com.murilosantostelles.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

import java.util.Arrays;


// Desafio: criar uma calculadora que valida se um numero é primo ou não.
// Retornar true se for e false se não for

// Desafio2: Criar uma calculador que recebe uma lista/array e retorna toda essa lista vezes 2


public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int [] numeros = {1,2,3,4,5,6,10,20};

        System.out.println(calculadora.verificarNumeroPrimo(8));
        int [] resultado = calculadora.dobrarListaDeNumeros(numeros);

        System.out.println(Arrays.toString(resultado));

        //for(int i = 0; i < resultado.length; i++){
        //    System.out.println(resultado[i]);
        //}
    }
}
