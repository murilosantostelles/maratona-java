package com.murilosantostelles.maratonajava.javacore.Oexception.exception.test;

import com.murilosantostelles.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try{
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException{
        Scanner leitorLogin = new Scanner(System.in);
        String user = "Murilo";
        String password = "murilost";
        System.out.println("User: ");
        String userType = leitorLogin.nextLine();
        System.out.println("Password: ");
        String passwordType = leitorLogin.nextLine();
        if(!user.equals(userType) || !password.equals(passwordType)){
            throw new LoginInvalidoException("Usuário ou senha inválidos.");
        }
        System.out.println("Usuário logado com sucesso.");
    }
}