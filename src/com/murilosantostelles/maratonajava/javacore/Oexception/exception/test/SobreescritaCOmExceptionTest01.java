package com.murilosantostelles.maratonajava.javacore.Oexception.exception.test;

import com.murilosantostelles.maratonajava.javacore.Oexception.exception.dominio.Funcionario;
import com.murilosantostelles.maratonajava.javacore.Oexception.exception.dominio.Pessoa;

public class SobreescritaCOmExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa01 = new Pessoa();
        Funcionario funcionario01 = new Funcionario();

        funcionario01.salvar();
    }
}
