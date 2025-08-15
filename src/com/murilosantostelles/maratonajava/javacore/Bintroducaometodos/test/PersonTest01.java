package com.murilosantostelles.maratonajava.javacore.Bintroducaometodos.test;

import com.murilosantostelles.maratonajava.javacore.Bintroducaometodos.dominio.Person;

public class PersonTest01 {
    public static void main(String[] args) {
        Person person01 = new Person();

        person01.setNome("Messi");
        person01.setIdade(36);

        System.out.println(person01.getNome());
        System.out.println(person01.getidade());
    }
}
