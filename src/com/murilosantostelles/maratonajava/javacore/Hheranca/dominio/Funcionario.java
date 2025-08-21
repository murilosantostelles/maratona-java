package com.murilosantostelles.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    public void imprime(){
        super.imprime(); //sobescrita de met odo. usa-se "super" para usar o metodo da classe pai, adicionando, nesse caso a impressão do salario(que nao tem na classe pai).
        System.out.println(this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
