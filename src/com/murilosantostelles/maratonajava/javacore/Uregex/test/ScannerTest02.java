package com.murilosantostelles.maratonajava.javacore.Uregex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String texto = "Levi, Eren, Mikasa,true,200";
        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(",");

        while(scanner.hasNext()){ // enquanto existir um proximo item
            if (scanner.hasNextInt()){ // se o proximo item for inteiro
                int i = scanner.nextInt(); // quero que voce pegue
                System.out.println("int "+i); // e printe como um inteiro
            } else if (scanner.hasNextBoolean()) { // se o proximo for boolean
                boolean b = scanner.nextBoolean(); // quero que você pegue
                System.out.println("boolean "+b); // e printe como um boolean
            }else{
                System.out.println(scanner.next());
            }
        }


    }
}
