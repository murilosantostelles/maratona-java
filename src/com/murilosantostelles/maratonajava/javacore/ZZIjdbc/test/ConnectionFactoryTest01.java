package com.murilosantostelles.maratonajava.javacore.ZZIjdbc.test;

import com.murilosantostelles.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import com.murilosantostelles.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import com.murilosantostelles.maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;
import com.murilosantostelles.maratonajava.javacore.ZZIjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Studio Deen").build();
        //ProducerService.save(producer);
        for(int i = 1; i <= 11; i++){
            ProducerService.delete(i);
        }
        
    }
}
