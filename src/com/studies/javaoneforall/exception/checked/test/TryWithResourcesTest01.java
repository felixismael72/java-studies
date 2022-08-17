package com.studies.javaoneforall.exception.checked.test;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {

    }

    private static void readFile()  {
        try (Reader reader = new BufferedReader(new FileReader("test.txt"))){

        } catch (IOException e) {

        }
    }

    private static void readFile2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
