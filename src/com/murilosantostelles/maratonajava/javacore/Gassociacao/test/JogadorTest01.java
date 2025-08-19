package com.murilosantostelles.maratonajava.javacore.Gassociacao.test;

import com.murilosantostelles.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");
        Jogador jogador2 = new Jogador("Romario");
        Jogador jogador3 = new Jogador("Cafu");

        Jogador[] jogadores = {jogador1,jogador2,jogador3}; //um array com os 3 jogadores

        for(Jogador jogador:jogadores){
            jogador.imprime();
        }
    }
}
