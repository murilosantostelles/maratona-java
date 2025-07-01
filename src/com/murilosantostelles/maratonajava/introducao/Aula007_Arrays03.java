package com.murilosantostelles.maratonajava.introducao;

public class Aula007_Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = {1,2,3,4,5}; // inicializando um array diretamente com os valores
        int soma = 0;

        for(int i = 0; i < numeros2.length; i++ ) {
            System.out.println(numeros2[i]);
        }
        for(int num: numeros2){
            System.out.println(num);// com esse tipo de for, não tem como acessar os índices
            soma += num;
        }
        System.out.println("Soma = "+ soma);
    }
}
