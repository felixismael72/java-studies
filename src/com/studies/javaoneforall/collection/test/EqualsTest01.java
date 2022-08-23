package com.studies.javaoneforall.collection.test;

import com.studies.javaoneforall.collection.domain.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1BACN2", "Pixel");
        Smartphone s2 = new Smartphone("1BACN2", "Pixel");

        System.out.println(s1.equals(s2));
    }
}
