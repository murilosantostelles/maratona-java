package com.murilosantostelles.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double [] salario;

    public void imprimir() {
        System.out.println("Nome : " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (salario != null) {
            for (double i : salario) {
                System.out.println("Salário: " + i);
            }
        }
    }
    public double calcularMedia(){ // não precisa passar parametro nesse caso.
        double soma = 0;
            for(double i : salario){
                soma += i;
            }
        double media = soma/salario.length;
        return media;
    }
}
