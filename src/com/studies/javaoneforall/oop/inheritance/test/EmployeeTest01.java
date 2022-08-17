package com.studies.javaoneforall.oop.inheritance.test;

import com.studies.javaoneforall.oop.inheritance.domain.Employee;
import com.studies.javaoneforall.oop.inheritance.domain.Manager;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Sanji", "245");

        e1.setSalary(3450.50);

        e1.print();

        Manager manager = new Manager("Zoro", "235");
        manager.setSalary(3450.50);
        manager.setDepartment("IT");


        manager.print();

        manager.paymentReport();
    }
}
