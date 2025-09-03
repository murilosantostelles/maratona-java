package com.murilosantostelles.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try{
            throw new RuntimeException();
        }catch (ArrayIndexOutOfBoundsException  | IllegalArgumentException | ArithmeticException e){
            System.out.println("Denttro do ArrayIndexOutOfBoundsException ... ...");
        }catch (IndexOutOfBoundsException e){
            System.out.println("dentro do IndexOutOfBoundsException");
        } catch (RuntimeException e) {
            System.out.println("dentro do RuntimeException");
        }
        try {
            talvezLanceException();
        } catch (SQLException | IOException e){ // 2 excessõespodem ser escritas juntas
            e.printStackTrace();
        }

    }

    private static void talvezLanceException() throws SQLException, IOException{

        }
}
