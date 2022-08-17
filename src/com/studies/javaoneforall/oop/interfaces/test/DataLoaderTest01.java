package com.studies.javaoneforall.oop.interfaces.test;

import com.studies.javaoneforall.oop.interfaces.domain.DatabaseLoader;
import com.studies.javaoneforall.oop.interfaces.domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        databaseLoader.remove();
        databaseLoader.checkPermission();
        fileLoader.load();
        fileLoader.remove();
        fileLoader.checkPermission();
    }
}
