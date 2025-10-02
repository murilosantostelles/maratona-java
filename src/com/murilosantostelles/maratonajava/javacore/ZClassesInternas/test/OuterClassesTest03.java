package com.murilosantostelles.maratonajava.javacore.ZClassesInternas.test;

import org.w3c.dom.ls.LSOutput;

public class OuterClassesTest03 {
    private String name  = "Murilo";
    static class Nested{
        void print(){
            System.out.println(new OuterClassesTest03().name);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested(); // não precisa do objeto outer class
        nested.print();
    }
}
