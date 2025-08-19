package com.murilosantostelles.maratonajava.javacore.Fmodificadorestatico.test;

import com.murilosantostelles.maratonajava.javacore.Fmodificadorestatico.dominio.Carro2;

public class CarroTest02 {

    public static void main(String[] args) {
        Carro2.setVelocidadeLimite(180);

        Carro2 c1 = new Carro2("bmw", 280);
        Carro2 c2 = new Carro2("Mercedes",2975);
        Carro2 c3 = new Carro2("Audi", 290);


        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
