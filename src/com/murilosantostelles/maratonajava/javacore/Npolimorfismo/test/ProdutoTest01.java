package com.murilosantostelles.maratonajava.javacore.Npolimorfismo.test;

import com.murilosantostelles.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import com.murilosantostelles.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import com.murilosantostelles.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador01 = new Computador("NUC10i7" , 11000);
        Tomate tomate01 = new Tomate("Tomate Siciliano" , 10);
        CalculadoraImposto.calcuarImpostoComputador(computador01);
        System.out.println("------------------");
        CalculadoraImposto.calcuarImpostoTomate(tomate01);

    }
}
