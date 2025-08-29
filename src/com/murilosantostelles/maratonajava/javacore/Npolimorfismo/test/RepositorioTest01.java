package com.murilosantostelles.maratonajava.javacore.Npolimorfismo.test;

import com.murilosantostelles.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import com.murilosantostelles.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;
import com.murilosantostelles.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio repositorio01 = new RepositorioArquivo(); 
        repositorio01.salvar();
    }
}
