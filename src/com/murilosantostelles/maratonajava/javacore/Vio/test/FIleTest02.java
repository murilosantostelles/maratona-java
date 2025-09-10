package com.murilosantostelles.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FIleTest02 {
    public static void main(String[] args) {
        // criando e deletando a file
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created "+isCreated);
            boolean exists = file.exists();
            if(exists){
                System.out.println("Deleted: "+file.delete());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
