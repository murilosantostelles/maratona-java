package com.murilosantostelles.maratonajava.javacore.ZZJcrud.dominio;

import lombok.Builder;
import lombok.Value;

@Value
@Builder //uso do lombok
public class Producer {
    Integer id;
    String name;
}
