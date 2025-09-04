package com.murilosantostelles.maratonajava.javacore.Pwrappers.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'W';
        boolean boolP = false;


        // São objetos // o wrapper existe pra passar os parametros numericos por referência, e não mais por valor. Da mesma forma, os tipos primitivos ainda
        // devem ser primeira opção de uso, pois as boas práticas o recomendam mais.
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1; // autoboxing
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean boolW = false;

        int i = intW; // unboxing

        Integer intW2 = Integer.parseInt("1");
        Boolean verdadeiro = Boolean.parseBoolean("TRUe");
        System.out.println(verdadeiro);

        System.out.println("---------------");

        System.out.println(Character.isDigit('A')); //vê se é um digito
        System.out.println(Character.isDigit('9')); //vê se é um dígito

        System.out.println(Character.toUpperCase('m')); // capslock
        System.out.println(Character.isLowerCase('M')); // verifica se é lowercase
    }
}
