package com.studies.javaoneforall.utility.stringclass.test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {
        //using string
        long begin = System.currentTimeMillis();
        concatString(100_000);
        long end = System.currentTimeMillis();
        System.out.println("Time taken with String " + (end - begin) + "ms");

        //using string builder
        long begin2 = System.currentTimeMillis();
        concatStringBuilder(1_000_000);
        long end2 = System.currentTimeMillis();
        System.out.println("Time taken with String Builder " + (end2 - begin2) + "ms");

        //using string buffer
        long begin3 = System.currentTimeMillis();
        concatStringBuffer(1_000_000);
        long end3 = System.currentTimeMillis();
        System.out.println("Time taken with String Buffer " + (end3 - begin3) + "ms");
    }

    private static void concatString(int size) {
        String text = "";
        for (int i = 0; i < size; i++) {
            text += i;
        }
    }

    private static void concatStringBuilder(int size) {
        StringBuilder text = new StringBuilder(size);
        for (int i = 0; i < size; i++) {
            text.append(i);
        }
    }

    private static void concatStringBuffer(int size) {
        StringBuffer text = new StringBuffer();
        for (int i = 0; i < size; i++) {
            text.append(i);
        }
    }
}
