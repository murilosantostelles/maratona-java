package com.murilosantostelles.maratonajava.javacore.Npolimorfismo.servico;

import com.murilosantostelles.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import com.murilosantostelles.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import com.murilosantostelles.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto){
        System.out.println("Relatório de imposto do produto:");
        double imposto = produto.calcularImposto();
        System.out.println("Nome do produto: "+produto.getNome());
        System.out.println("Valor do produto: "+produto.getValor());
        System.out.println("Imposto a ser pago: "+imposto);

    }
}
