package com.studies.javaoneforall.oop.methods.test;

import com.studies.javaoneforall.oop.methods.domain.Person;

public class PersonTest01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Sanji");
        person.setAge(17);
        System.out.println("Hello, "+person.getName()+"!");
    }
}
