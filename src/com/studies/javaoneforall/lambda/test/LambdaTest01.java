package com.studies.javaoneforall.lambda.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> strings = List.of("Monkey", "Bird", "Dog");
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        forEach(strings, System.out::println);
        forEach(integers, System.out::println);
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }
    }
}
