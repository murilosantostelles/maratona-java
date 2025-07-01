package com.murilosantostelles.maratonajava.javacore.Aintroducaoclasses.test;

import com.murilosantostelles.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.nome = "Sanji";
        estudante.idade = 30;
        estudante.sexo = 'M';

        estudante2.nome = "Thorfinn";
        estudante2.idade = 20;
        estudante2.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);

        System.out.println("------------------");

        System.out.println(estudante2.nome);
        System.out.println(estudante2.sexo);
        System.out.println(estudante2.idade);
    }
}
