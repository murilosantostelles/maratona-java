package com.murilosantostelles.maratonajava.javacore.ZZDstreams.test;

import com.murilosantostelles.maratonajava.javacore.ZZDstreams.dominio.Category;
import com.murilosantostelles.maratonajava.javacore.ZZDstreams.dominio.LightNovel;
import com.murilosantostelles.maratonajava.javacore.ZZDstreams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;

public class StremTest15 {
    private static List<LightNovel> lightNovels = new ArrayList<>( List.of(new LightNovel("Tensei Shittara" , 8.99, Category.FANTASY)
            , new LightNovel("Overlord" , 3.99, Category.FANTASY),
            new LightNovel("Violet Evergarden" , 10.99, Category.DRAMA) ,
            new LightNovel("No game no life" , 2.99, Category.FANTASY),
            new LightNovel("Fullmetal Alchemist" , 5.99, Category.FANTASY),
            new LightNovel("Kumo Desuga" , 1.99, Category.FANTASY),
            new LightNovel("Monogatari" , 4.00, Category.ROMANCE)
    ));
    public static void main(String[] args) {
        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.summarizingDouble(LightNovel::getPrice)));

        System.out.println(collect);
        System.out.println("============");


    }
    private static Promotion getPromotion(LightNovel ln){
        return ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }

}
