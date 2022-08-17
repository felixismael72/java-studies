package com.studies.javaoneforall.oop.polymorphism.domain;

public class Tomato extends Product {
    public static final double TAX_PERCENTAGE = 0.06;
    private String bestConsumedBefore;
    public Tomato(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTaxValue() {
        return this.price * TAX_PERCENTAGE;
    }

    public String getBestConsumedBefore() {
        return bestConsumedBefore;
    }

    public void setBestConsumedBefore(String bestConsumedBefore) {
        this.bestConsumedBefore = bestConsumedBefore;
    }
}
