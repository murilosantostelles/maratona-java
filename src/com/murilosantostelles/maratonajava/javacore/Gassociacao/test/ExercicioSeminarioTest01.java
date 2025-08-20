package com.murilosantostelles.maratonajava.javacore.Gassociacao.test;

import com.murilosantostelles.maratonajava.javacore.Gassociacao.dominio.Aluno;
import com.murilosantostelles.maratonajava.javacore.Gassociacao.dominio.Local;
import com.murilosantostelles.maratonajava.javacore.Gassociacao.dominio.Professor2;
import com.murilosantostelles.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class ExercicioSeminarioTest01 {
    public static void main(String[] args) {
        Local local1 = new Local("Escola Felicidade");
        Aluno aluno1 = new Aluno("Juca" , 12);
        Aluno aluno2 = new Aluno("Pedrinho" , 12);
        Aluno aluno3 = new Aluno("Murilo" , 19);
        Aluno aluno4 = new Aluno("Maria Eduarda" , 19);
        Aluno[] alunos = {aluno1, aluno2};
        Aluno[] alunos02 = {aluno3,aluno4};
        Professor2 professor1 = new Professor2("Marcos" , "Matematica");
        Seminario seminario1 = new Seminario("Como investir seu dinheiro");
        Seminario seminario2 = new Seminario("Aprenda a programar");
        Seminario[] seminarios = {seminario1,seminario2};



        aluno1.setSeminario(seminario1);
        aluno2.setSeminario(seminario1);
        seminario1.setLocal(local1);
        seminario1.setAlunos(alunos);

        seminario1.imprime();

        System.out.println("----------------");

        aluno3.setSeminario(seminario2);
        aluno4.setSeminario(seminario2);
        seminario2.setLocal(local1);
        seminario2.setAlunos(alunos02);

        seminario2.imprime();

        System.out.println("----------------");

        //adicionando os seminarios ao professor que ira ministrá-los

        professor1.setSeminarios(seminarios);

        professor1.imprime();
    }
}
