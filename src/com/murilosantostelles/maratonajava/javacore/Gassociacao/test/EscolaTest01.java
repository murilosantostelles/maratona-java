package com.murilosantostelles.maratonajava.javacore.Gassociacao.test;


import com.murilosantostelles.maratonajava.javacore.Gassociacao.dominio.Escola;
import com.murilosantostelles.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Cirilo");
        Professor professor2 = new Professor("Jaime Palilo");
        Professor[] professores = {professor1 , professor2};
        Escola escola1 = new Escola("Escola Mundial" , professores);


        escola1.imprime();
    }
}
