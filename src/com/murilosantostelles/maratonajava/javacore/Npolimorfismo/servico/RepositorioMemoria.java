package com.murilosantostelles.maratonajava.javacore.Npolimorfismo.servico;

import com.murilosantostelles.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memoria");
    }
}
