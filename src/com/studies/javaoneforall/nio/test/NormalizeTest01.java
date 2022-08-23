package com.studies.javaoneforall.nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String directory = "folder/subfolder/subfolder2";
        String fileText = "../../file.txt";

        Path filePath = Paths.get(directory, fileText);

        System.out.println(filePath);
        System.out.println(filePath.normalize());
    }
}
