package com.studies.javaoneforall.oop.polymorphism.service;

import com.studies.javaoneforall.oop.polymorphism.repository.Repository;

public class FileRepositoryService implements Repository {
    @Override
    public void save() {
        System.out.println("Saving in the file");
    }
}
