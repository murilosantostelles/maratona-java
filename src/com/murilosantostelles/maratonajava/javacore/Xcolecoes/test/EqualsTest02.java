package com.murilosantostelles.maratonajava.javacore.Xcolecoes.test;

import com.murilosantostelles.maratonajava.javacore.Xcolecoes.dominio.Smartphone;

public class EqualsTest02 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "Iphone");
        Smartphone s2 = new Smartphone("1ABC1", "Iphone");
        Smartphone s3 = s1;

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3)); // exatamente o mesmo objeto
    }
}
