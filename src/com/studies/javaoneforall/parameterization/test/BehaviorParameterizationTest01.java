package com.studies.javaoneforall.parameterization.test;

import com.studies.javaoneforall.parameterization.domain.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BehaviorParameterizationTest01 {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2019));

    public static void main(String[] args) {
        System.out.println(filter(cars, car -> car.getColor().equals("green")));
        System.out.println(filter(cars, car -> car.getColor().equals("black")));
        System.out.println(filter(cars, car -> car.getYear() < 2015));
    }

    private static List<Car> filter(List<Car> cars, Predicate<Car> predicate) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (predicate.test(car)) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }
}
