package com.murilosantostelles.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double [] salario;

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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalario() {
        return salario;
    }
}
