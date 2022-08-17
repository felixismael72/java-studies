package com.studies.javaoneforall.oop.classes.test;

import com.studies.javaoneforall.oop.classes.domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student = new Student();
        student.age = 20;
        student.name = "Luffy";
        student.gender = 'M';

        System.out.println(student.age);
        System.out.println(student.name);
        System.out.println(student.gender);
    }
}
