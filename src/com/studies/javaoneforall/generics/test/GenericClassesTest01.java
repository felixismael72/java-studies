package com.studies.javaoneforall.generics.test;

import com.studies.javaoneforall.generics.domain.Boat;
import com.studies.javaoneforall.generics.domain.Car;
import com.studies.javaoneforall.generics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class GenericClassesTest01 {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW"));
        cars.add(new Car("Audi"));

        RentalService<Car> carRentalService = new RentalService<>(cars);
        Car car = carRentalService.retrieveAvailableVehicle();
        System.out.println("--------------------------------");
        System.out.println("Using car for a month...");
        System.out.println("--------------------------------");
        carRentalService.returnRentVehicle(car);

        System.out.println();

        List<Boat> boats = new ArrayList<>();
        boats.add(new Boat("Boat1"));
        boats.add(new Boat("Boat2"));

        RentalService<Boat> boatRentalService = new RentalService<>(boats);
        Boat boat = boatRentalService.retrieveAvailableVehicle();
        System.out.println("--------------------------------");
        System.out.println("Using car for a month...");
        System.out.println("--------------------------------");
        boatRentalService.returnRentVehicle(boat);
    }
}
