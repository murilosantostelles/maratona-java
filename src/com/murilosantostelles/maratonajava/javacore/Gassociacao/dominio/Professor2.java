package com.murilosantostelles.maratonajava.javacore.Gassociacao.dominio;

public class Professor2 {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;


    public void imprime(){
        System.out.println("Professor: "+this.nome);
        System.out.println("Especialidade de "+nome+": "+this.especialidade);
        for (Seminario seminario : seminarios) {
            System.out.println("Título do seminário ministrado por "+nome+": "+seminario.getTitulo());
        }

    }

    public Professor2(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
