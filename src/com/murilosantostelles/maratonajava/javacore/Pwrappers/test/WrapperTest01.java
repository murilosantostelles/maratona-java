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
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean boolW = false;
    }
}
