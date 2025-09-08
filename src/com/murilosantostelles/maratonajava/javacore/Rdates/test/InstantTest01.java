package com.murilosantostelles.maratonajava.javacore.Rdates.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String[] args) {
        // trabalha com nanosegundos. Representa um ponto instantâneo dentro de uma timeline

        Instant now = Instant.now();
        System.out.println(now); // zulu time (aparece um Z no final do numero). Importante pra salvar data no banco de dados.
        System.out.println(LocalDateTime.now());
    }
}
