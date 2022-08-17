package com.studies.javaoneforall.oop.inheritance.domain;

public class Employee {
    protected String name;
    protected String socialSecurityNumber;
    protected Address address;
    protected double salary;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, String socialSecurityNumber) {
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public void print() {
        System.out.println("------------");
        System.out.println("Name - " + this.name);
        System.out.println("Social security number - " + this.socialSecurityNumber);
        System.out.println("Salary - " + this.salary);
        if (address == null) return;
        System.out.println("Address - " + this.address.getStreet());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
