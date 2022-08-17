package com.studies.javaoneforall.oop.methods.domain;

public class Calculator {
    public void sumTwoNumbers(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public void subtractTwoNumbers(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    public void multiplyTwoNumbers(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideTwoNumbers(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    public void sumVarArgs(int... numbers) {
        int sum = 0;
        for (int num: numbers) {
            sum += num;
        }

        System.out.println(sum);
    }
}
