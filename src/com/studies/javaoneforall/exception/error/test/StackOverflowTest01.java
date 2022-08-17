package com.studies.javaoneforall.exception.error.test;

public class StackOverflowTest01 {
    public static void main(String[] args) {
        recursion();
    }

    public static void recursion() {
        recursion();
    }
}
