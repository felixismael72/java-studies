package com.studies.javaoneforall.oop.polymorphism.test;

import com.studies.javaoneforall.oop.polymorphism.domain.Computer;
import com.studies.javaoneforall.oop.polymorphism.domain.Tomato;
import com.studies.javaoneforall.oop.polymorphism.service.ProductTaxReportService;

public class ProductTest01 {
    public static void main(String[] args) {
        Computer computer = new Computer("NUC10i7", 1000);
        Tomato tomato = new Tomato("Italian Tomato", 5);
        tomato.setBestConsumedBefore("11/09/2022");

        ProductTaxReportService.generateTaxReport(computer);
        System.out.println("-----------------------");
        ProductTaxReportService.generateTaxReport(tomato);
    }
}
