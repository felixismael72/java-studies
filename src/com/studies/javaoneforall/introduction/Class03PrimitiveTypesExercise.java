package com.studies.javaoneforall.introduction;

/*
Create variables for the fields described below between <> and print the following message:

I <name>, living at <address>, confirm that I received the salary of <salary> on <date>
*/
public class Class03PrimitiveTypesExercise {
    public static void main(String[] args) {
        String name = "Sujeito";
        String address = "456 Rua sem saída";
        float salary = 1000.5F;
        String receivedSalaryDate = "13/08/2022";

        String report = "I "+name+", living at "+address+", confirm that I received the salary of "+salary+" on "+receivedSalaryDate;

        System.out.println(report);
    }
}
