package com.murilosantostelles.maratonajava.javacore.Kenum.test;

import com.murilosantostelles.maratonajava.javacore.Kenum.dominio.Cliente;
import com.murilosantostelles.maratonajava.javacore.Kenum.dominio.TipoCliente;
import com.murilosantostelles.maratonajava.javacore.Kenum.dominio.TipoPagamento;
public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Carlos" , TipoCliente.PESSOA_FISICA , TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Lucas" , TipoCliente.PESSOA_JURIDICA , TipoPagamento.DEBITO);


        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
    }
}