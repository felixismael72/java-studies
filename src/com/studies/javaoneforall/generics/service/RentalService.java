package com.studies.javaoneforall.generics.service;

import java.util.List;

public class RentalService<T> {
    private List<T> availableVehicles;

    public RentalService(List<T> availableVehicles) {
        this.availableVehicles = availableVehicles;
    }

    public T retrieveAvailableVehicle() {
        System.out.println("------------------------");
        System.out.println("Searching for any vehicle available...");
        System.out.println("------------------------");
        T t = availableVehicles.remove(0);
        System.out.println("Renting the vehicle: " + t);
        System.out.println("Available vehicles to rent: "+availableVehicles);
        return t;
    }

    public void returnRentVehicle(T t) {
        System.out.println("Returning the vehicle: " + t);
        availableVehicles.add(t);
        System.out.println("Available vehicles to rent: " + availableVehicles);
    }
}
