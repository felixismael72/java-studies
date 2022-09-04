package com.studies.javaoneforall.innerclass.test;

public class OuterClassesTest02 {
    private String name = "Roronoa Zoro";

    void print() {
        class LocalClass {
            public void printName() {
                System.out.println(name);
            }
        }
        new LocalClass().printName();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print();
    }
}
