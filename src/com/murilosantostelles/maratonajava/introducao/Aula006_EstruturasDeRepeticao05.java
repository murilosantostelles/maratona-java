package com.murilosantostelles.maratonajava.introducao;

public class Aula006_EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Condição: valor da parcela >= 1000
        double valorCarro = 30000;
        for (int i = (int) valorCarro; i >= 1; i--){
            double valorParcela = valorCarro/i;
            if (valorParcela < 1000){
                continue;
            }
            System.out.println(i+" Vez(es) de R$"+valorParcela);
        }
    }
}
