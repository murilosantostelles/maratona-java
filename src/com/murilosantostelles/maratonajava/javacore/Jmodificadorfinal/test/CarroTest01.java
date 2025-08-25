package com.murilosantostelles.maratonajava.javacore.Jmodificadorfinal.test;

import com.murilosantostelles.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import com.murilosantostelles.maratonajava.javacore.Jmodificadorfinal.dominio.Comprador;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Comprador comprador2 = new Comprador();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        carro1.COMPRADOR.setNome("Fulano");
        System.out.println(carro1.COMPRADOR);
    }
}
