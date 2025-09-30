package com.murilosantostelles.maratonajava.javacore.YGenerics.test;


import java.util.ArrayList;
import java.util.List;

public class WildCardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = new ArrayList<>();
        List<Gato> gatos = new ArrayList<>();


    }
    private static void printConsulta(List<Animal> animals){
        for (Animal animal : animals) {
            animal.consulta();
        }
        animals.add(new Cachorro());

    }
}
