package com.murilosantostelles.maratonajava.javacore.Bintroducaometodos.test;

import com.murilosantostelles.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest06 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int[] numeros = {1,2,3,4,5};

        //Tradicional:
        calculadora.somaArray(numeros);

        //VarArgs:
        calculadora.somaVarArgs(1,2,3,4,5,6,7,8); // Da pra passar diretamente escrevendo os numeros,pois
        // o java já passa os numeros como array. (...) usar os 3 pontos dps de int no metodo.

    }
}
