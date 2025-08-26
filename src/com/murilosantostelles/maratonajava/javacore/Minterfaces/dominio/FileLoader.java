package com.murilosantostelles.maratonajava.javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader{
    @Override
    public void load() {
        System.out.println("carregando dados de um arquivo...");
    }
}
