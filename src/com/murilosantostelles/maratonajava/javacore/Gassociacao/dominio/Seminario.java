package com.murilosantostelles.maratonajava.javacore.Gassociacao.dominio;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;


    public void imprime(){
        System.out.println("Título do seminário: "+this.titulo);
        if(local == null) return;
        System.out.println("Local: "+local.getEndereco());
        if(alunos == null) return;
        for (Aluno aluno : alunos) {
            System.out.println("Nome do aluno: "+aluno.getNome());
            System.out.println("Idade de "+aluno.getNome()+": "+aluno.getIdade());
        }
    }

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Aluno[] alunos, Local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
