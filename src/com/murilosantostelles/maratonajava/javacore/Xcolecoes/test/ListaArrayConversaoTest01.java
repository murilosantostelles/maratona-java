package com.murilosantostelles.maratonajava.javacore.Xcolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    public static void main(String[] args) {
        // Conversão de ArrayList pra Array
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        Integer [] integersArray = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(integersArray));

        System.out.println("---------------");

        // COnversão de Array pra ArrayList

        Integer [] numerosArray = new Integer[3];
        numerosArray[0] = 1;
        numerosArray[1] = 2;
        numerosArray[2] = 3;

        List<Integer> arrayToList = Arrays.asList(numerosArray);
        System.out.println(arrayToList);
    }
}
