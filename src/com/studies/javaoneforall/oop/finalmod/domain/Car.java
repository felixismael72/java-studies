package com.studies.javaoneforall.oop.finalmod.domain;

public class Car {
    private String name;
    public final Buyer BUYER = new Buyer();
    public static final double SPEED_LIMIT = 250;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
