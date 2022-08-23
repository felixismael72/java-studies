package com.studies.javaoneforall.nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolverTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("folder/subfolder");
        Path file = Paths.get("subfolder2/file.txt");
        Path resolve = dir.resolve(file);

        System.out.println(resolve);
    }
}
