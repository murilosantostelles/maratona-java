package com.murilosantostelles.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {

    public abstract void load();

    default void checkPermissio(){
        System.out.println("Fazendo checagem de permissões.");
    }
}
