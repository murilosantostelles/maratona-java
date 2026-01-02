package com.murilosantostelles.maratonajava.javacore.ZZIjdbc.test;

import com.murilosantostelles.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import com.murilosantostelles.maratonajava.javacore.ZZIjdbc.service.ProducerServiceRowSet;
import lombok.extern.log4j.Log4j2;

import java.util.List;


public class ConnectionFactoryTest02 {
    public static void main(String[] args) {
        List<Producer> producers = ProducerServiceRowSet.findByNameJdbcRowSet("Mappa");
        System.out.println(producers);
    }
}
