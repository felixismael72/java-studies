package com.studies.javaoneforall.exception.checked.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        customFileCreator();
    }

    private static void customFileCreator() {
        File file = new File("folder/test.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("File created: " + isCreated);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
