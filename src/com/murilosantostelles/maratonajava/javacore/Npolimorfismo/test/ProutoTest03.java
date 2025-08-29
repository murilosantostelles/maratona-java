package com.murilosantostelles.maratonajava.javacore.Npolimorfismo.test;

import com.murilosantostelles.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import com.murilosantostelles.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import com.murilosantostelles.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import com.murilosantostelles.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProutoTest03 {
    public static void main(String[] args) {

        Produto produto01 = new Computador("Ryzen 9" , 3000);

        Tomate tomate01 = new Tomate("Tomatinho" , 5);
        tomate01.setDataValidade("11/12/2025");

        CalculadoraImposto.calcularImposto(tomate01);
        System.out.println("----------------");
        CalculadoraImposto.calcularImposto(produto01);

    }
}
