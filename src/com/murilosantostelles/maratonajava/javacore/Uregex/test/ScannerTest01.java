package com.murilosantostelles.maratonajava.javacore.Uregex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "Levi, Eren, Mikasa";

        String[] nomes = texto.split(","); // escolhe o delimitadores, no caso coloquei a vírgula, aí ele pega o resto(tokens)
        for (String nome : nomes) {
            System.out.println(nome.trim()); // trim remove os espaços
        }


    }
}
