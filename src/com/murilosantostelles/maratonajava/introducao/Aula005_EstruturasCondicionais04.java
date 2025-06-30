package com.murilosantostelles.maratonajava.introducao;

public class Aula005_EstruturasCondicionais04 {
    public static void main(String[] args) {
        //EXERCICIO:
        //dado um determinado salario anual, calcular qual valor do imposto (na Holanda)
        double annualSalary = 70000;
        double tax;
        if (annualSalary <= 34712){
            annualSalary *= 9.70;
        }else if(annualSalary >= 34713 && annualSalary <= 68507){
            annualSalary *= 37.35;
        }else{
            annualSalary *= 49.50;
        }
        tax = annualSalary/100;
        System.out.println("tax to be paid: "+tax);
    }
}
