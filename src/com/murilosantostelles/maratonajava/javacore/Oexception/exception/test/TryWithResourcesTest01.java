package com.murilosantostelles.maratonajava.javacore.Oexception.exception.test;

import com.murilosantostelles.maratonajava.javacore.Oexception.exception.dominio.Leitor1;
import com.murilosantostelles.maratonajava.javacore.Oexception.exception.dominio.Leitor2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;


//  try with resources - try com recursos
public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo();
    }

    public static void lerArquivo(){
        try(Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2()){

        } catch (IOException e){

        }
    }
}
