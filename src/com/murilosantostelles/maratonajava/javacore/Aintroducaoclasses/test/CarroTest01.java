package com.murilosantostelles.maratonajava.javacore.Aintroducaoclasses.test;

import com.murilosantostelles.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        // para o carro 1 fazer referência ao carro 2, por exemplo,
        // basta digitar carro = carro2, ou vice versa.

        carro.marca = "Volkswagen";
        carro.modelo = "T-Cross";
        carro.ano = 2020;

        carro2.marca = "BMW";
        carro2.modelo = "320i";
        carro2.ano = 2022;

        System.out.println("Marca: "+carro.marca +" | Modelo: "+carro.modelo+"| Ano: "+carro.ano);
        System.out.println("Marca: "+carro2.marca +" | Modelo: "+carro2.modelo+"| Ano: "+carro2.ano);
    }
}
