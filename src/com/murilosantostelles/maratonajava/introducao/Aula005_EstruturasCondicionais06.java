package com.murilosantostelles.maratonajava.introducao;

public class Aula005_EstruturasCondicionais06 {
    public static void main(String[] args) {
        //Utilizando switch case: dado os valores de 1 a 7, imprima se é dia util ou final de semana.
        //considerando 1 como domingo
        byte day = 3;
        switch (day) {
            default:
                System.out.println("Inválido");
                break;
            case 1:
                System.out.println("Final de Semana.");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil.");
                break;
            case 7:
                System.out.println("Final de semana.");
                break;
        }
    }
}
