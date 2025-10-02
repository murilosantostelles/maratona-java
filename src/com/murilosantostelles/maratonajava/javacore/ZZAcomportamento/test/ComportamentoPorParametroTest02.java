package com.murilosantostelles.maratonajava.javacore.ZZAcomportamento.test;

import com.murilosantostelles.maratonajava.javacore.ZZAcomportamento.dominio.Car;
import com.murilosantostelles.maratonajava.javacore.ZZAcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest02 {
    private static List<Car> cars = List.of(new Car("Green", 2011), new Car("Black" , 1998), new Car("Red", 2019));
    public static void main(String[] args) {
        List<Car> greenCars = filter(cars, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equals("Green");
            }
        });

        List<Car> redCars = filter(cars, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equals("Red");
            }
        });

        List<Car> yearBeforeCars = filter(cars , car -> car.getYear() < 2015);

        System.out.println(greenCars);
        System.out.println(redCars);
        System.out.println(yearBeforeCars);

    }
    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate){
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if(carPredicate.test(car)){
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }




}
