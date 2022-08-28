package com.studies.javaoneforall.collection.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversionTest01 {
    public static void main(String[] args) {
        List<Integer> numberList01 = new ArrayList<>();

        numberList01.add(1);
        numberList01.add(2);
        numberList01.add(3);

        Integer[] numberArray01 = numberList01.toArray(new Integer[0]);
        System.out.println(numberList01);
        System.out.println(Arrays.toString(numberArray01));
        System.out.println("---------------------");

        Integer[] numberArray02 = {1, 2, 3};
        List<Integer> numberList02 = Arrays.asList(numberArray02);
        System.out.println(Arrays.toString(numberArray02));
        System.out.println(numberList02);

        List<Integer> numberList03 = new ArrayList<>(Arrays.asList(numberArray02));
        System.out.println("-----------------------");
        System.out.println(numberList03);
    }
}
