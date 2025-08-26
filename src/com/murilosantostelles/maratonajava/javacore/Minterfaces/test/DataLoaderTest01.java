package com.murilosantostelles.maratonajava.javacore.Minterfaces.test;


import com.murilosantostelles.maratonajava.javacore.Minterfaces.dominio.DatabaseLoader;
import com.murilosantostelles.maratonajava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader01 = new DatabaseLoader();
        FileLoader fileLoader01 = new FileLoader();

        databaseLoader01.load();
        fileLoader01.load();
    }
}
