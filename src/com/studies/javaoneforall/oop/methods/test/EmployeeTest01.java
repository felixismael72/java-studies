package com.studies.javaoneforall.oop.methods.test;

import com.studies.javaoneforall.oop.methods.domain.Employee;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setName("Sanji");
        employee.setAge(18);
        employee.setSalaries(new double[]{1250.5, 450.3, 5065.25});

        employee.print();
    }
}
