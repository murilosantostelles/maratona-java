package com.murilosantostelles.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// File
// File Writter
// FileReader
// BufferedWriter
// BufferedReader
public class FileWritterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true)){
            fw.write("O DevDojo é o melhor curso do Brasil \n");
            fw.write("Linha Dois");
            fw.flush(); // usar antes de dar close no fileWriter
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
