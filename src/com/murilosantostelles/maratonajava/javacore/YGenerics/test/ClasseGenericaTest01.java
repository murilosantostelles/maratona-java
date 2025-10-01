package com.murilosantostelles.maratonajava.javacore.YGenerics.test;

import com.murilosantostelles.maratonajava.javacore.YGenerics.dominio.Carro;
import com.murilosantostelles.maratonajava.javacore.YGenerics.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        // as classes de carro não são genericas, pois teria que replicar a classe se eu quisesse fazer um aluguel de barco.
        // aí que entram as classes genericas. Elas servem para simplificar o codigo, criando uma classe unica que trabalha tanto com carro tanto com barco
        CarroRentavelService carroRentavelService = new CarroRentavelService();

        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando o carro "+ carro +" por um mes...");
        carroRentavelService.retornarCarroAlugado(carro);
    }
}
