package com.studies.javaoneforall.nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/username");
        Path classN = Paths.get("/home/username/project/Test01.java");

        Path pathToClass = dir.relativize(classN);
        System.out.println(pathToClass);
    }
}
