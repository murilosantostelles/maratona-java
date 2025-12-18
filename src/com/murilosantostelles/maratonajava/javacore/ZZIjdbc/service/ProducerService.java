package com.murilosantostelles.maratonajava.javacore.ZZIjdbc.service;

import com.murilosantostelles.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import com.murilosantostelles.maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;

public class ProducerService {
    public static void save(Producer producer){
        ProducerRepository.save(producer);
    }

    public static void delete(int id){
        if(id<=0){
            throw new IllegalArgumentException("Invalid id value");
        }
        ProducerRepository.delete(id);
    }
}
