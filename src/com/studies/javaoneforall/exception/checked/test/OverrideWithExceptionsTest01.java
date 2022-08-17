package com.studies.javaoneforall.exception.checked.test;

import com.studies.javaoneforall.exception.checked.domain.Employee;
import com.studies.javaoneforall.exception.checked.domain.LoginInvalidException;
import com.studies.javaoneforall.exception.checked.domain.Person;

import java.io.FileNotFoundException;

public class OverrideWithExceptionsTest01 {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.save();
        } catch (LoginInvalidException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        Employee employee = new Employee();
        try {
            employee.save();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
