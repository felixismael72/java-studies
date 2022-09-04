package com.studies.javaoneforall.generics.test;

import java.util.List;

abstract class Animal {
    public abstract void consult();
}

class Dog extends Animal {
    @Override
    public void consult() {
        System.out.println("Consulting dog");
    }
}

class Cat extends Animal {
    @Override
    public void consult() {
        System.out.println("Consulting cat");
    }
}

public class WildCardTest01 {
    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<Cat> cats = List.of(new Cat(), new Cat());

        printConsult(dogs);
        printConsult(cats);
    }

    private static void printConsult(List<? extends Animal> animals) {
        System.out.println("--------------");
        for (Animal animal : animals) {
            animal.consult();
        }
    }
}
