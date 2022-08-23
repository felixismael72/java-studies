package com.studies.javaoneforall.nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path path = Paths.get("/home/ismael/IdeaProjects/java-one-for-all","java-one-for-all.iml");
        System.out.println(path.getFileName());
    }
}
