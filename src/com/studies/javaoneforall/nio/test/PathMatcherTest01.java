package com.studies.javaoneforall.nio.test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTest01 {
    public static void main(String[] args) {
        Path path = Paths.get("folder/file.txt");

        matches(path, "glob:**/*.txt");
    }

    private static void matches(Path path, String glob) {
        PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " + pathMatcher.matches(path));
    }
}
