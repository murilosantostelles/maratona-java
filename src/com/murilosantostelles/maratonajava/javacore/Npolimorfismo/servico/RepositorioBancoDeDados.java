package com.murilosantostelles.maratonajava.javacore.Npolimorfismo.servico;

import com.murilosantostelles.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no Banco de Dados");
    }
}
