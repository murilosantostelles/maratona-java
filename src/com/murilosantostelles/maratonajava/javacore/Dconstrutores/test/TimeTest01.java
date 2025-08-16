package com.murilosantostelles.maratonajava.javacore.Dconstrutores.test;

import com.murilosantostelles.maratonajava.javacore.Dconstrutores.dominio.Time;

public class TimeTest01 {
    public static void main(String[] args) {
        Time time01 = new Time("Botafogo" , 29, "Savarino", 1);
        Time time02 = new Time("Real Madrid" , 100, "Vini jr", 2);

        System.out.println(time01.getNome());
        System.out.println(time01.getTrofeus());
        System.out.println(time01.getMelhorJogador());
        System.out.println(time01.getPosicaoNaTabela());

        System.out.println("------------------");

        System.out.println(time02.getNome());
        System.out.println(time02.getTrofeus());
        System.out.println(time02.getMelhorJogador());
        System.out.println(time02.getPosicaoNaTabela());
    }
}
