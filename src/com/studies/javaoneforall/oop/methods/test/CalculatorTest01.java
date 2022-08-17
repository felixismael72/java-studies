package com.studies.javaoneforall.oop.methods.test;

import com.studies.javaoneforall.oop.methods.domain.Calculator;

public class CalculatorTest01 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sumTwoNumbers(5, 2);
        calculator.subtractTwoNumbers(5, 2);
        calculator.multiplyTwoNumbers(2, 5);
    }
}
