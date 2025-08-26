package com.murilosantostelles.maratonajava.javacore.Lclassesabstratas.test;

import com.murilosantostelles.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import com.murilosantostelles.maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;
import com.murilosantostelles.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente01 = new Gerente("Nami" , 5000);
        Desenvolvedor desenvolvedor01 = new Desenvolvedor("Oto" , 12000);
        System.out.println(gerente01);
        System.out.println(desenvolvedor01);


    }

}
