package com.murilosantostelles.maratonajava.javacore.ZZIjdbc.test;

import com.murilosantostelles.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import com.murilosantostelles.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import com.murilosantostelles.maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;
import com.murilosantostelles.maratonajava.javacore.ZZIjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Mappa").build();
        Producer producerToUpdate = Producer.builder().id(12).name("MADHOUSE").build();
        //ProducerService.save(producer);
        //ProducerService.delete(13);
        //ProducerService.update(producerToUpdate);
        //List<Producer> producers = ProducerService.findAll();
        //System.out.println("Producers found: "+ producers);

        //List<Producer> producersFiltered = ProducerService.findByName("map");
        //System.out.println("Producers filtered by name found: "+ producersFiltered);

        //ProducerService.showProducerMetaData();
        ProducerService.showDriverMetaData();
    }
}
