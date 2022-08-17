package com.studies.javaoneforall.introduction;

public class Class08MultidimensionalArrays01 {
    public static void main(String[] args) {
        int[][] days = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};

        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < days[i].length; j++) {
                System.out.println("índices: "+i+" "+j);
                System.out.println("valor: "+days[i][j]);
            }
        }
    }
}
