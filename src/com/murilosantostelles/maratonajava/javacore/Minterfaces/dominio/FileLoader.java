package com.murilosantostelles.maratonajava.javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("carregando dados de um arquivo...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo arquivos do banco de dados.");
    }

    @Override
    public void checkPermissio() {
        System.out.println("Checando permissoes no arquivo.");
    }
}
