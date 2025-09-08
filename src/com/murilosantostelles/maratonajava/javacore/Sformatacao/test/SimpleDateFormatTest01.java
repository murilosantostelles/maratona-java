package com.murilosantostelles.maratonajava.javacore.Sformatacao.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "yyyy.MM.dd G 'at' 'qualquer adicional, eu coloco entre aspas simples' HH:mm:ss z";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        // jeito mais flexível de trabalhar com formatação de datas.

        System.out.println(sdf.format(new Date()));


    }
}
