package com.murilosantostelles.maratonajava.javacore.ZClassesInternas.test;

public class OuterClassesTest01 {
    private String name = "Monkey D. Luffy";

    class Inner{
        public void printOuterClassAtribute(){
            System.out.println(name);
            System.out.println(this); // this da classe interna
            System.out.println(OuterClassesTest01.this); // this da classe externa
        }
    }

    public static void main(String[] args) {
        // uma classe dentro da outra
        OuterClassesTest01 outerClass = new OuterClassesTest01();
        Inner inner = outerClass.new Inner();
        Inner inner2 = outerClass.new Inner();
        inner.printOuterClassAtribute();
        inner2.printOuterClassAtribute();
    }
}
