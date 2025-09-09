package com.murilosantostelles.maratonajava.javacore.Sformatacao.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        // passar se String pra data e data pra String formatada de acordo com o local.

        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(s1); // datas formatadas em String
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("---------------");
        //passando de String pra Objeto agora
        LocalDate parse1 = LocalDate.parse("20250909" ,DateTimeFormatter.BASIC_ISO_DATE); // passa esses dois parametros
        System.out.println(parse1);

        System.out.println("----------------");

        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBR);
        System.out.println(formatBR);
        LocalDate parseBR = LocalDate.parse("09/09/2025",formatterBR);
        System.out.println(parseBR);
    }
}
