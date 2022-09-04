package com.studies.javaoneforall.generics.test;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        // Type erasure
        List<String> names = new ArrayList<>();
        names.add("Luffy");
        names.add("Zore");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
