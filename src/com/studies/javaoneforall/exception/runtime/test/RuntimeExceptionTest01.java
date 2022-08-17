package com.studies.javaoneforall.exception.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        // Example
        getNullPointerException();
    }

    public static void getNullPointerException() {
        Object obj = null;
        System.out.println(obj.toString());
    }
}
