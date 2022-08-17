package com.studies.javaoneforall.exception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(division(1, 0));
    }

    /**
     * @param a int
     * @param b int, cannot be zero
     * @return int
     * @throws IllegalArgumentException if b is zero
     * **/
    private static int division(int a, int b) {
       if (b == 0) {
           throw new IllegalArgumentException("The second parameter can't be zero");
       }

       return a / b;
    }
}
