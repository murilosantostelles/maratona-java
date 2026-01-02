package com.murilosantostelles.maratonajava.javacore.ZZIjdbc.test;

import com.murilosantostelles.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import com.murilosantostelles.maratonajava.javacore.ZZIjdbc.service.ProducerService;
import com.murilosantostelles.maratonajava.javacore.ZZIjdbc.service.ProducerServiceRowSet;
import lombok.extern.log4j.Log4j2;

import java.util.List;


public class ConnectionFactoryTest02 {
    public static void main(String[] args) {
        Producer producerToUpdate = Producer.builder().id(15).name("mad").build();
        ProducerServiceRowSet.updateJdbcRowSet(producerToUpdate);
        System.out.println("-----------------");
        List<Producer> producers = ProducerServiceRowSet.findByNameJdbcRowSet("");
        System.out.println(producers);
    }
}
