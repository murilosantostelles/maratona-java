package com.murilosantostelles.maratonajava.javacore.Npolimorfismo.servico;

import com.murilosantostelles.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import com.murilosantostelles.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcuarImpostoComputador(Computador computador){
        System.out.println("Relatório de imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("Nome do computador: "+computador.getNome());
        System.out.println("Valor do computador: "+computador.getValor());
        System.out.println("Imposto do computador: "+computador.calcularImposto());

    }

    public static void calcuarImpostoTomate(Tomate tomate){
        System.out.println("Relatório de imposto do tomate");
        double imposto = tomate.calcularImposto();
        System.out.println("Nome do tomate: "+tomate.getNome());
        System.out.println("Valor do tomate: "+tomate.getValor());
        System.out.println("Imposto do tomate: "+tomate.calcularImposto());

    }
}
