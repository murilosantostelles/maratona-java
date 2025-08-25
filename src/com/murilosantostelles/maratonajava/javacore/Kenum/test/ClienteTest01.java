package com.murilosantostelles.maratonajava.javacore.Kenum.test;

import com.murilosantostelles.maratonajava.javacore.Kenum.dominio.Cliente;
import com.murilosantostelles.maratonajava.javacore.Kenum.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Carlos" , TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Carlos" , TipoCliente.PESSOA_JURIDICA);


        System.out.println(cliente1);
        System.out.println(cliente2);

    }
}
