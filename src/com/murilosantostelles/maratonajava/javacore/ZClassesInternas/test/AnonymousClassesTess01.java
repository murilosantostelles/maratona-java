package com.murilosantostelles.maratonajava.javacore.ZClassesInternas.test;

class Animal{
    public void walk(){
        System.out.println("Animal walking");
    }
}

public class AnonymousClassesTess01 {
    // são classes que vão existir brevemente por um determinado periodo de tempo no codigo e que não pode se reutilizada em nenhumm outro lugar
    public static void main(String[] args) {
        Animal animal = new Animal(){
            @Override
            public void walk() { // isso é u a subclasse anonima que só vai ser utilizada nesse trecho do codigo
                System.out.println("walking in the shadows");
            }
        };
        animal.walk();
    }
}
