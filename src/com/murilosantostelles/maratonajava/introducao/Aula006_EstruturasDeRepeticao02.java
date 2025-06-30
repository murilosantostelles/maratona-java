package com.murilosantostelles.maratonajava.introducao;

public class Aula006_EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Exercício usando "for" : imprimir todos os números pares até 1000000
        System.out.println("Números pares de 0 a 1000000: ");
        for(int i = 0; i <= 1000000 ; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
