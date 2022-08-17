package com.studies.javaoneforall.oop.methods.test;

import com.studies.javaoneforall.oop.methods.domain.Calculator;

public class CalculatorTest03 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sumVarArgs(1, 2, 4, 5, 7, 19);
    }
}
