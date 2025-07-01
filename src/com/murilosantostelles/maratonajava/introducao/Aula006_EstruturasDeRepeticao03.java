package com.murilosantostelles.maratonajava.introducao;

public class Aula006_EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        // break
        // exercicio: dada uma contagem de 0 a 50, pare no numero 25.
        int contador = 0;
        while(contador <= 50){
            System.out.println(contador);
            contador++;
            if(contador == 25){
                System.out.println(contador);
                break;
            }
        }
    }
}
