package com.studies.javaoneforall.introduction;

public class Class08MultidimensionalArrays02 {
    public static void main(String[] args) {
        int[][] days = new int[3][3];
        days[0][0] = 1;
        days[0][1] = 2;
        days[0][2] = 3;
        days[1][0] = 4;
        days[1][1] = 5;
        days[1][2] = 6;
        days[2][0] = 7;
        days[2][1] = 8;
        days[2][2] = 9;

        for (int[] baseArray : days) {
            for (int day : baseArray) {
                System.out.println(day);
            }
        }
    }
}
