package com.murilosantostelles.maratonajava.javacore.Fmodificadorestatico.test;

import com.murilosantostelles.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("bmw", 280);
        Carro c2 = new Carro("Mercedes",2975);
        Carro c3 = new Carro("Audi", 290);


        Carro.velocidadeLimite = 180; // altwrando da forma correta a velocidade limite, que possui o modificador static.
    }
}
