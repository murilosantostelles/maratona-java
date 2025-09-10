package com.murilosantostelles.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FIleTest03 {
    public static void main(String[] args) {
        // criando e deletando a file + pegando o path + conferindo se é file + conferindo se é diretório
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created "+isCreated);
            System.out.println(file.getPath());
            System.out.println(file.getAbsoluteFile());
            System.out.println("is file: "+file.isFile());
            System.out.println("is directory: "+file.isDirectory());
            System.out.println("Is hidden: "+file.isHidden()); // é oculto?
            System.out.println("last modified: "+new Date(file.lastModified())); // vendo ultima data de modificação da file (usando formatação em data pra ficar mais legível)
            boolean exists = file.exists();
            if(exists){
                System.out.println("Deleted: "+file.delete());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
