package com.studies.javaoneforall.introduction;

public class Class05ConditionalStatement01 {
    public static void main(String[] args) {
        int age = 15;

        boolean isAllowedToBuyAlcohol = age >= 18;

        // basic if-else statement
        if (isAllowedToBuyAlcohol) {
            System.out.println("Pode comprar álcool.");
        } else {
            System.out.println("Desculpe, você não pode comprar álcool.");
        }
    }
}
