package com.murilosantostelles.maratonajava.javacore.Xcolecoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        // passa a chave e o valor
        Map<String, String> map = new HashMap<>();
        map.put("teklado" , "teclado"); // no map, usa-se o "put" ao invés do "add"
        map.put("mouse" , "mouse");
        map.put("vc" , "você");

        for(String key : map.keySet()){ // imprimindo todas as chaves
            System.out.println(key);
        }

        System.out.println("-------------");

        // entry -> objeto que vai ter a chave e o valor
        for(Map.Entry<String, String> entry: map.entrySet()){
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }
    }
}
