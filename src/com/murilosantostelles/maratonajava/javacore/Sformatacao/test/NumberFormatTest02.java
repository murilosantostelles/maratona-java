package com.murilosantostelles.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localeBR = new Locale("pt", "BR");
        Locale localeIT = Locale.ITALY;
        Locale localeJP = Locale.JAPAN;
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getCurrencyInstance(); // Usamos o .getCurrencyInstance pra converter pra valor monetário (não usa-se o .getInstance)
        nfa[1] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[2] = NumberFormat.getCurrencyInstance(localeBR);
        nfa[3] = NumberFormat.getCurrencyInstance(localeIT);
        double valor = 1_000.2130;

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(valor));
        }

        System.out.println("-------------");
        String valorString = "1000.2130";
        System.out.println(Double.parseDouble(valorString));

    }
}
