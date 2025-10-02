package com.murilosantostelles.maratonajava.javacore.ZZAcomportamento.test;

import com.murilosantostelles.maratonajava.javacore.ZZAcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(new Car("Green", 2011), new Car("Black" , 1998), new Car("Red", 2019));
    public static void main(String[] args) {
        System.out.println(filterGreenCar(cars));
        System.out.println(filterCarByColor(cars, "Red"));

    }

    private static List<Car> filterGreenCar(List<Car> cars){
        List<Car> greenCars = new ArrayList<>();
        for (Car car : cars) {
            if(car.getColor().equals("Green")){
                greenCars.add(car);
            }
        }
        return greenCars;
    }

    private static List<Car> filterCarByColor(List<Car> cars, String color){ // metodo mais escalável. Passa a cor como parametro pra evitar repetição de metodo
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if(car.getColor().equals(color)){
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }
}
