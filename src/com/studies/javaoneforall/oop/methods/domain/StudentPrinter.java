package com.studies.javaoneforall.oop.methods.domain;

public class StudentPrinter {
    public static void print(Student student) {
        System.out.println("--------------");
        System.out.println(student.age);
        System.out.println(student.name);
        System.out.println(student.gender);
    }
}
