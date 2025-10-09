package com.murilosantostelles.maratonajava.javacore.ZZDstreams.test;

import com.murilosantostelles.maratonajava.javacore.ZZDstreams.dominio.Category;
import com.murilosantostelles.maratonajava.javacore.ZZDstreams.dominio.LightNovel;
import com.murilosantostelles.maratonajava.javacore.ZZDstreams.dominio.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StremTest13 {
    private static List<LightNovel> lightNovels = new ArrayList<>( List.of(new LightNovel("Tensei Shittara" , 8.99, Category.FANTASY)
            , new LightNovel("Overlord" , 3.99, Category.FANTASY),
            new LightNovel("Violet Evergarden" , 10.99, Category.DRAMA) ,
            new LightNovel("No game no life" , 2.99, Category.FANTASY),
            new LightNovel("Fullmetal Alchemist" , 5.99, Category.FANTASY),
            new LightNovel("Kumo Desuga" , 1.99, Category.FANTASY),
            new LightNovel("Monogatari" , 4.00, Category.ROMANCE)
    ));
    public static void main(String[] args) {
        Map<Promotion, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(ln -> { // agrupando pela promoção
                    return ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
                }
        ));
        System.out.println(collect);
    }
}
