package com.murilosantostelles.maratonajava.javacore.Hheranca.test;

import com.murilosantostelles.maratonajava.javacore.Hheranca.dominio.Endereco;
import com.murilosantostelles.maratonajava.javacore.Hheranca.dominio.Funcionario;
import com.murilosantostelles.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco();
        endereco1.setRua("Rua 3");
        endereco1.setCep("2232-123");
        Pessoa pessoa1 = new Pessoa("Murilo");
        pessoa1.setCpf("123456");
        pessoa1.setEndereco(endereco1);

        pessoa1.imprime();

        System.out.println("----------------");
        Funcionario funcionario1 = new Funcionario("Gepeto");

        funcionario1.setCpf("12344566");
        funcionario1.setEndereco(endereco1);
        funcionario1.setSalario(20000);

        funcionario1.imprime();
    }
}
