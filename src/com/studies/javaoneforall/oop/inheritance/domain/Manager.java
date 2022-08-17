package com.studies.javaoneforall.oop.inheritance.domain;

public class Manager extends Employee {
    private String department;

    public Manager(String name) {
        super(name);
    }

    public Manager(String name, String socialSecurityNumber) {
        super(name, socialSecurityNumber);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Department - " + this.department);
    }

    public void paymentReport() {
        System.out.println("--- Payment report ---");
        System.out.println("The manager "+this.name+ " of "+this.department+
                " received $"+this.salary+" of salary");
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
