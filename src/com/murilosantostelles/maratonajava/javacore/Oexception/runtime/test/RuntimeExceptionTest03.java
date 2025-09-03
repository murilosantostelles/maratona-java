package com.murilosantostelles.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        try{
            System.out.println("Abrindo arquivo");
            throw new RuntimeException();


        }catch (Exception e){

            e.printStackTrace();
        }finally { // bloco de código que SEMPRE será execuado
            System.out.println("Fechando recurso liberado pelo sistema operacional.");
        }
    }
}
