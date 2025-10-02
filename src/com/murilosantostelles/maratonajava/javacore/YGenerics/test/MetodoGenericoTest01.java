package com.murilosantostelles.maratonajava.javacore.YGenerics.test;


import com.murilosantostelles.maratonajava.javacore.YGenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        criarArrayComUmObjeto(new Barco("Canoa Marota"));
    }
    private static <T> void criarArrayComUmObjeto(T t){
        List<T> list = new ArrayList<>();
        list.add(t);
        System.out.println(list);
    }
}

