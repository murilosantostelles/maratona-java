package com.murilosantostelles.maratonajava.javacore.WSerializacao.dominio;

import java.io.Serial;
import java.io.Serializable;

public class Aluno implements Serializable {
    private Long id;
    private String nome;
    private transient String password; // significa que esse atributo não deverá ser serializado

    public Aluno(long id, String nome, String password) {
        this.id = id;
        this.nome = nome;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
