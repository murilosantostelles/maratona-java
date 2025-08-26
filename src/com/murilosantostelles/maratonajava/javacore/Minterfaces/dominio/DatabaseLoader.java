package com.murilosantostelles.maratonajava.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo do banco de dados.");
    }

    @Override
    public void checkPermissio() {
        System.out.println("Checando permissoes no banco de dados");
    }


    public static void retrieveMaxDataSize(){
        System.out.println("dentro do retrieveMaxDataSize na classe DatabaseLoader");
    }
}
