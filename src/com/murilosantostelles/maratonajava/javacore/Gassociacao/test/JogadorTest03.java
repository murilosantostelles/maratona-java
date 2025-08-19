package com.murilosantostelles.maratonajava.javacore.Gassociacao.test;

import com.murilosantostelles.maratonajava.javacore.Gassociacao.dominio.Jogador;
import com.murilosantostelles.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Messi");
        Jogador jogador2 = new Jogador("Neymar");
        Time time1 = new Time("Barcelona");
        Jogador[] jogdores = {jogador1, jogador2};


        jogador1.setTime(time1); // adicionando o jogador ao time
        jogador2.setTime(time1);
        time1.setJogadores(jogdores); // adicionando jogador ao time

        System.out.println("--- Jogadores --- ");

        jogador1.imprime();


        System.out.println("--- Time ---");
        
        time1.imprime();


    }
}
