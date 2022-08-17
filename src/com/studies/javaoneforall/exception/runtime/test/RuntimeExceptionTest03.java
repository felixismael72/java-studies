package com.studies.javaoneforall.exception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        System.out.println(openConnection());
    }

    private static String openConnection() {
        try {
            System.out.println("Opening connection");
            System.out.println("Writing to the database");
            return "connected";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Close");
        }
        return "not connected";
    }
}
