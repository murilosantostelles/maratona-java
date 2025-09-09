package com.murilosantostelles.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest07 {
    public static void main(String[] args) {
        // principais:
        // \d = Todos os dígitos (numeros do texto)
        // \D = Tudo que NÃO for dígito
        // \s = Todos os espaços em branco
        // \S = Todos os caracteres excluindo os brancos (é o contrário do de cima)
        // \w = Tudo de A até Z, dígitos, underline
        // \W = Tudo que não for incluso no \w (ou seja, simbolos como @,#, etc)
        // [] = range. Ex a-z, A-C
        // pra escrever um numero hexadecimal no java, eu preciso iniciar o numero com "0x"
        // olhar no obsidian o resto

        String regex = "([a-zA-z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail";
        System.out.println("#@!zoro@mail.br".matches(regex)); // false, pois não bate com a expressão regular
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  "+texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex: "+regex);
        System.out.println("Posições encontradas");
        while(matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
    }
}
