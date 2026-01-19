package com.murilosantostelles.maratonajava.javacore.ZZKjunit.test;

import com.murilosantostelles.maratonajava.javacore.ZZKjunit.dominio.Person;
import com.murilosantostelles.maratonajava.javacore.ZZKjunit.service.PersonService;

public class PersonServiceTest01 {
    public static void main(String[] args) {
        Person person = new Person(15);
        PersonService personService = new PersonService();

        System.out.println("Is Adult? "+personService.isAdult(person));
    }
}
