package com.murilosantostelles.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }
    private static void criarNovoArquivo(){
        File file = new File("arquivo\\teste.txt");
        try{
           boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado "+isCriado);
        }catch(IOException e){
            e.printStackTrace(); //imprime tudo que aconteceu na stack
            //simplesmente pra lidar com exceções. Não colocar regra de negócio no catch, mas também não deixar ele vazio
        }
    }
}
