package com.murilosantostelles.maratonajava.javacore.Npolimorfismo.test;

import com.murilosantostelles.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import com.murilosantostelles.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import com.murilosantostelles.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class ProutoTest02 {
    public static void main(String[] args) {
        Produto produto01 = new Computador("Ryzen 9" , 3000);
        System.out.println(produto01.getNome());
        System.out.println(produto01.getValor());
        System.out.println(produto01.calcularImposto());

        System.out.println("-------------------");

        Produto produto02 = new Tomate("Tomatão" , 5);
        System.out.println(produto02.getNome());
        System.out.println(produto02.getValor());
        System.out.println(produto02.calcularImposto());

    }
}
