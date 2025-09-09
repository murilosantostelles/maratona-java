package com.murilosantostelles.maratonajava.javacore.Tresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        // forma de internacionaliar mensagens (como se fosse a tradução dos sites)
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("mensagens", new Locale("pt", "BR"));

        boolean sassa = bundle.containsKey("sassa");
        System.out.println(sassa); // retorna false, pois a chave "sassa" não existe no arquivo de mensgens que eu criei

        System.out.println("---------------------------------------");

        System.out.println(bundle.getString("oi")); // chave existente em mensagens ptbr
        System.out.println(bundle.getString("bom.dia")); // chave existente em mensagens ptbr

        bundle = ResourceBundle.getBundle("mensagens", new Locale("en", "US"));
        System.out.println(bundle.getString("oi")); // chave existente em mensagens en_US
        System.out.println(bundle.getString("bom.dia")); // chave existente em mensagens en_US
    }
}
