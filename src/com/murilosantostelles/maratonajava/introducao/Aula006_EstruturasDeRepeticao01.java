package com.murilosantostelles.maratonajava.introducao;

public class Aula006_EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while , for
        int contador = 0;
        while (contador<10){
            System.out.println("while "+ contador);
            contador += 1;
        }
        do{
            System.out.println("Oi");
        }while(contador < 10);

        for (int i=0; i<10; i++){ //declara variavel/até aonde vai contar/passo
            System.out.println("for "+ i );
        }
    }
}
