package com.murilosantostelles.maratonajava.introducao;

public class Aula005_EstruturasCondicionais02 {
    public static void main(String[] args) {
        int age = 19;
        String categoria = "";
        if(age < 15){
            categoria = ("Categoria Infantil.");
        }else if (age >= 15 && age < 18){
            categoria = ("Categoria Juvenil.");
        }else{
            categoria = ("Categoria Adulto.");
        }
        System.out.println(categoria);
    }
}
