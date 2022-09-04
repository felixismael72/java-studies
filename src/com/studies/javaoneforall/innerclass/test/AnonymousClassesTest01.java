package com.studies.javaoneforall.innerclass.test;

class Animal {
    public void walk() {
        System.out.println("Animal walking");
    }
}

public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        Animal cat = new Animal(){
            @Override
            public void walk() {
                System.out.println("Cat walking");;
            }
        };

        cat.walk();
    }
}
