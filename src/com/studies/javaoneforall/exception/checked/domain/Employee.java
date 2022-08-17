package com.studies.javaoneforall.exception.checked.domain;

import java.io.FileNotFoundException;

public class Employee extends Person {
    @Override
    public void save() throws FileNotFoundException  {
    }
}
