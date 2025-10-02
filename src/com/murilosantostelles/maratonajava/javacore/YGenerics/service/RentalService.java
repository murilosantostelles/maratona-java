package com.murilosantostelles.maratonajava.javacore.YGenerics.service;

import com.murilosantostelles.maratonajava.javacore.YGenerics.dominio.Barco;
import com.murilosantostelles.maratonajava.javacore.YGenerics.dominio.Carro;

import java.util.List;

public class RentalService<T> {
    private List<T> objetosDisponiveis;

    public RentalService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T buscarObjetoDisponivel(){


        System.out.println("BUscando carro disponivel...");
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando Objeto: "+ t);
        System.out.println("Objetos Disponiveis para alugar: ");
        System.out.println(objetosDisponiveis);
        return t;
    }

    public void retornarObjetoAlugado(T t){
        System.out.println("Devolvendo carro "+t);
        objetosDisponiveis.add(t);
        System.out.println("Objetos disponiveis para alugar: ");
        System.out.println(objetosDisponiveis);
    }
}
