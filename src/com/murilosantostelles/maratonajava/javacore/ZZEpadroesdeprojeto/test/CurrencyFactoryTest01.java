package com.murilosantostelles.maratonajava.javacore.ZZEpadroesdeprojeto.test;

import com.murilosantostelles.maratonajava.javacore.ZZEpadroesdeprojeto.dominio.Country;
import com.murilosantostelles.maratonajava.javacore.ZZEpadroesdeprojeto.dominio.Currency;
import com.murilosantostelles.maratonajava.javacore.ZZEpadroesdeprojeto.dominio.CurrencyFactory;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());
    }
}
