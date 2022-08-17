package com.studies.javaoneforall.oop.polymorphism.service;

import com.studies.javaoneforall.oop.polymorphism.domain.Product;
import com.studies.javaoneforall.oop.polymorphism.domain.Tomato;

public class ProductTaxReportService {
    public static void generateTaxReport(Product product) {
        System.out.println("--- Product report ---");
        System.out.println("Product: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Tax Value: " + product.calculateTaxValue());
        if (product instanceof Tomato tomato) {
            System.out.println("Best consumed before: " +tomato.getBestConsumedBefore());
        }
    }
}
