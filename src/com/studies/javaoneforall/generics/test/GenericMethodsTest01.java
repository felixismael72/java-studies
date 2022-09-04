package com.studies.javaoneforall.generics.test;

import com.studies.javaoneforall.generics.domain.Boat;

import java.util.List;

public class GenericMethodsTest01 {
    public static void main(String[] args) {
        createArrayWithOneObject(new Boat("Big boat"));
    }

    private static <T> void createArrayWithOneObject(T t) {
        List<T> list = List.of(t);
        System.out.println(list);
    }
}
