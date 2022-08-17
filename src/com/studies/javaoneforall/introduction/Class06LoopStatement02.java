package com.studies.javaoneforall.introduction;

public class Class06LoopStatement02 {
    public static void main(String[] args) {
        double totalPrice = 20000;
        for (int monthCount = (int) totalPrice; monthCount >= 1; monthCount--) {
            double monthlyPrice = totalPrice / monthCount;
            if (monthlyPrice < 1000) {
                continue;
            }
            System.out.println("Months "+monthCount+ " Price: "+monthlyPrice);
        }
    }
}
