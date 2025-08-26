package com.murilosantostelles.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10; //p s f -> redundante
    public abstract void load();

    default void checkPermissio(){
        System.out.println("Fazendo checagem de permissões.");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("dentro do retrieveMaxDataSize na interface");
    }
}
