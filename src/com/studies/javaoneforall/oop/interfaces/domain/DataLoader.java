package com.studies.javaoneforall.oop.interfaces.domain;

public interface DataLoader {
    static final int MAX_DATA_SIZE = 10;
    void load();
    default void checkPermission() {
        System.out.println("Checking general data permission...");
    }
}
