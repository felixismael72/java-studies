package com.studies.javaoneforall.collection.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Luffy");
        names.add("Zoro");
        names.add("Nami");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
