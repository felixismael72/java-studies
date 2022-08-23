package com.studies.javaoneforall.collection.test;

import com.studies.javaoneforall.collection.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1BACN2", "Pixel");
        Smartphone s2 = new Smartphone("22222", "IPhone");
        Smartphone s3 = new Smartphone("33333", "Samsung");

        List<Smartphone> smartphones = new ArrayList<>(6);

        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);

        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }
    }
}
