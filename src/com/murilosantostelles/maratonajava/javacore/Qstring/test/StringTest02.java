package com.murilosantostelles.maratonajava.javacore.Qstring.test;

import java.util.Locale;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "Luffy";
        String numeros = "012345";

        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("f", "m"));
        System.out.println(nome.toUpperCase(Locale.ROOT));
        System.out.println(numeros.length());
        System.out.println(numeros.substring(2,5)); // mostr do indice 2 até o indice 5-1 (sempre mostra até um antes do indice final colocado).

    }
}
