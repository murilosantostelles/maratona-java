package com.murilosantostelles.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptiontest02 {
    public static void main(String[] args) {
        System.out.println(divisao(20,0));
    }

    /**
     *
     * @param a
     * @param b não pode ser 0
     * @return
     * @throws IllegalArgumentException caso b seja zero
     */


    private static int divisao(int a, int b){
        if(b==0){
            throw new IllegalArgumentException("Argumento ilegal. Não pode ser 0."); // sempre tentar usar as exceções mais específicas possíveis.
        }
        return a/b;
    }
}