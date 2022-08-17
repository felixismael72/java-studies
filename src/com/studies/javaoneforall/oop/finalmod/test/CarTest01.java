package com.studies.javaoneforall.oop.finalmod.test;

import com.studies.javaoneforall.oop.finalmod.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setName("BMW");

        car.BUYER.setName("Buyer");
        System.out.println(car.getName());
        System.out.println(Car.SPEED_LIMIT);
        System.out.println(car.BUYER.getName());
    }
}
