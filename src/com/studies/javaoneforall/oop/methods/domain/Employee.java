package com.studies.javaoneforall.oop.methods.domain;

public class Employee {
    private String name;
    private int age;
    private double[] salaries;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getSalaries() {
        return salaries;
    }

    public void setSalaries(double[] salaries) {
        this.salaries = salaries;
    }

    public void print() {
        System.out.println(name);
        System.out.println(age);
        for (double salary: salaries) {
            System.out.println(salary);
        }
    }
}
