package com.murilosantostelles.maratonajava.javacore.Bintroducaometodos.test;

import com.murilosantostelles.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();

        funcionario01.nome = "Murilo";
        funcionario01.idade = 19;
        funcionario01.salario = new double[]{1200,987.32,2000};

        funcionario01.imprimir();
        System.out.println("A média salarial é: "+funcionario01.calcularMedia());
    }
}
