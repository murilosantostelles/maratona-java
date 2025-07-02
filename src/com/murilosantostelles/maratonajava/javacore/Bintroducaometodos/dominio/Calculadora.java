package com.murilosantostelles.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    // Evitar o uso do void, para não printar no méto do (função)
    // se eu usar public static somaDoisNumeros, eu não precisaria instanciar

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
            return; // esse return é so pra parar a execução.
        }
        System.out.println(num1/num2);

    }

    public void alteraDoisNumeros(int n1 , int n2){
        n1 = 99;
        n2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Numero 1 : "+n1);
        System.out.println("Numero 2 : "+n2);
    }

    // Desafio: criar uma calculadora que valida se um numero é primo ou não.
        // Retornar true se for e false se não for

    // Desafio2: Criar uma calculador que recebe uma lista/array e retorna toda essa lista vezes 2

    public boolean verificarNumeroPrimo(int n){
        if (n < 2){
            return false;
        }else{
            for(int i = 2; i < n; i++){
                if (n % i == 0){
                    return false;
                }
            }
            return true;
        }
    }
    public int[] dobrarListaDeNumeros(int[] nums){
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i] * 2;
        }
        return nums;
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println("A soma é igual a: "+soma);
    }
    //VarArgs -> só muda na chamada em relação ao de cima.
    public void somaVarArgs(int... numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println("A soma é igual a: "+soma);
    }
}
