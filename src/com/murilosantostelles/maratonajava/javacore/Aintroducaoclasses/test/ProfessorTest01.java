package com.murilosantostelles.maratonajava.javacore.Aintroducaoclasses.test;

import com.murilosantostelles.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Jacinto";
        professor.idade = 45;
        professor.sexo = 'M';

        System.out.println("nome: "+professor.nome+" idade: "+professor.idade+" sexo: "+professor.sexo);
    }
}
