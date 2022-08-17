package com.studies.javaoneforall.oop.polymorphism.test;

import com.studies.javaoneforall.oop.polymorphism.repository.Repository;
import com.studies.javaoneforall.oop.polymorphism.service.DatabaseRepositoryService;
import com.studies.javaoneforall.oop.polymorphism.service.FileRepositoryService;
import com.studies.javaoneforall.oop.polymorphism.service.InMemoryRepositoryService;

public class RepositoryTest01 {
    public static void main(String[] args) {
        Repository fileRepository = new FileRepositoryService();
        Repository dbRepository = new DatabaseRepositoryService();
        Repository memRepository = new InMemoryRepositoryService();

        fileRepository.save();
        dbRepository.save();
        memRepository.save();
    }
}
