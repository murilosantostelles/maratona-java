package com.murilosantostelles.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros(){ // Não tem como usar return no void.
        System.out.println(10 + 10);
    }
    public void subtracaoDoisNumeros(){
        System.out.println(20-10);
    }
    public void multiplicacaoDoisNumeros(int num1, int num2 ){
        System.out.println (num1+" * "+num2+" = "+ num1*num2 );
    }
    public double divideDoisNumeros(double num1, double num2){
        if (num2 == 0){
            return 0;
        }else{
            return (num1/num2);
        }
    }
    public void imprimeDivisaoDeDoisNumeros(double num1 , double num2){
        if(num2 == 0){
            System.out.println("Não existe divisão com denominador zero.");
            return;
        }
        System.out.println(num1/num2);

    }
}
