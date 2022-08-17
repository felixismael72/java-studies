package com.studies.javaoneforall.introduction;

public class Class05ConditionalStatement02 {
    public static void main(String[] args) {
        // age < 15 category junior
        // age >= 15 && age < 18 category senior
        // age >= 18 category master

        int age = 15;
        String category;
        if (age < 15) {
            category = "Categoria Júnior.";
        } else if (age >= 15 && age < 18) {
            category = "Categoria Sênior.";
        } else {
            category = "Categoria Mestre.";
        }

        System.out.println(category);
    }
}
