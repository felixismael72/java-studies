package com.studies.javaoneforall.oop.methods.test;

import com.studies.javaoneforall.oop.methods.domain.Student;
import com.studies.javaoneforall.oop.methods.domain.StudentPrinter;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();

        student01.age = 17;
        student01.name = "Luffy";
        student01.gender = 'M';

        student02.age = 17;
        student02.name = "Zoro";
        student02.gender = 'M';

        StudentPrinter.print(student01);
        StudentPrinter.print(student02);
    }
}
