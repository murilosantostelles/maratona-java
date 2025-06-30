package com.murilosantostelles.maratonajava.introducao;

public class Aula005_EstruturasCondicionais03 {
    public static void main(String[] args) {
        //OPERADOR TERNÁRIO:
        // estrutura: String resultado = (condicao) ? verdadeiro : falso
        double salary = 4999;
        String messageDonate = "Pode realizar a doação de R$500,00";
        String messageNotDonate = "Não pode realizar a doação de R$500,00";
        String result = salary >= 5000 ? messageDonate : messageNotDonate;
        System.out.println(result);
    }
}
