package com.murilosantostelles.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // principais:
        // \d = Todos os dígitos (numeros do texto)
        // \D = Tudo que NÃO for dígito
        // \s = Todos os espaços em branco
        // \S = Todos os caracteres excluindo os brancos (é o contrário do de cima)
        // \w = Tudo de A até Z, dígitos, underline
        // \W = Tudo que não for incluso no \w (ou seja, simbolos como @,#, etc)
        String regex = "\\d";
        // String texto = "abaaba";
        String texto2 = "efewlkfh2g476fwekfweh3829";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto:  "+texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex: "+regex);
        System.out.println("Posições encontradas");
        while(matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
    }
}
