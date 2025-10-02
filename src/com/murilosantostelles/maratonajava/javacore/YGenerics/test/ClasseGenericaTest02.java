package com.murilosantostelles.maratonajava.javacore.YGenerics.test;

import com.murilosantostelles.maratonajava.javacore.YGenerics.dominio.Barco;
import com.murilosantostelles.maratonajava.javacore.YGenerics.dominio.Carro;
import com.murilosantostelles.maratonajava.javacore.YGenerics.service.CarroRentavelService;
import com.murilosantostelles.maratonajava.javacore.YGenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        // Usando a classe generica List<T> -> List<Carro> ou List<Barco>
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("lancha"), new Barco("Canoa")));

        RentalService<Carro> rentalService = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalService.buscarObjetoDisponivel();
        System.out.println("Usando carro por um mes");
        rentalService.retornarObjetoAlugado(carro);
    }
}
