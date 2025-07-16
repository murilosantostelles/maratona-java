package com.murilosantostelles.maratonajava.introducao;

public class Aula009_Testes {
    public static void main(String[] args) {
        int soma = 0;
        int [] numeros = new int[3];
        numeros[0] = 2;
        numeros[1] = 4;
        numeros[2] =6;
        for(int i = 0; i < numeros.length; i++ ){
            soma += numeros[i];
        }
        System.out.println("A soma é : "+soma);
    }
}
