package com.murilosantostelles.maratonajava.introducao;

public class Aula007_Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float, double 0
        // char '/u0000' ' '
        // boolean false
        // String null

        String[] names = new String[4];
        names[0] = "Murilo";
        names[1] = "Santos";
        names[2] = "Telles";
        for(int i = 0; i < names.length; i++){ // lenght é como a função len do python.
            System.out.println(names[i]);
        }
    }
}
