package com.murilosantostelles.maratonajava.javacore.Oexception.error.test;

public class StackOverFlowTest01 {
    public static void main(String[] args) {

    }

    public static void recursividade(){
        recursividade(); //mé t odo se chamando varias vezes, até que em um momento da um "StackOverFowError"//
    }
}
