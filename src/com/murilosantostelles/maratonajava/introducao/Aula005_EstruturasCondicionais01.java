package com.murilosantostelles.maratonajava.introducao;

public class Aula005_EstruturasCondicionais01 {
    public static void main(String[] args) {
        int age = 15;
        boolean isAutorizadoComprarBebida = age >= 18;
        if(isAutorizadoComprarBebida) {
            System.out.println("Pode comprar bebida alcoolica. ");
        }else{
            System.out.println("Não pode comprar bebida alcoolica. ");
        }
        System.out.println("Fora do if");
    }
}
//continuar a partir do else if (se não, se...)