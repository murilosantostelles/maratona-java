package com.murilosantostelles.maratonajava.introducao;

public class Aula005_EstruturasCondicionais05 {
    public static void main(String[] args) {
        //Imprimir o dia da seamana, considerando 1 como Domingo.
        byte day = 5;
        // usamos o switch para uma melhor leitura, sendo uma alternativa à vários if/else if, em casos como
        // esse do dia da semana
        //switch só é possivel com variáveis dos tipos: char, int, byte, short, enum, String.
        switch (day) {
            default:
                System.out.println("Opção Inválida."); //caso nenhum dos cases seja executado
                break;
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
        }
        char gender = 'J';
        switch (gender){
            default:
                System.out.println("Invalid.");
                break;
            case 'M':
                System.out.println("Male");
                break;
            case 'F':
                System.out.println("Female");
                break;
        }
    }
}
