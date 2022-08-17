package com.studies.javaoneforall.introduction;

public class Class05ConditionalStatement03 {
    public static void main(String[] args) {
        // if salary > 2000 "buy ps5" else "don't buy ps5"

        double salary = 3500D;
        String shouldBuyMessage = "buy PS5";
        String shouldNotBuyMessage = "don't buy PS5";
        String displayMessage;

        displayMessage = salary > 2000 ? shouldBuyMessage : shouldNotBuyMessage;

        System.out.println(displayMessage);
    }
}
