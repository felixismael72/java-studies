package com.studies.javaoneforall.nio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        LocalDateTime dateTime = LocalDateTime.now().minusDays(10);

        Path folderPath = Paths.get("folder");
        if (Files.notExists(folderPath)) {
            Files.createDirectory(folderPath);
        }

        Path filePath = Paths.get(folderPath.toString(), "file.txt");
        if (Files.notExists(filePath)) {
            Files.createFile(filePath);
        }

        FileTime fileTime = FileTime.from(dateTime.toInstant(ZoneOffset.UTC));

        Files.setLastModifiedTime(filePath, fileTime);

        System.out.println("last modified at: "+Files.getLastModifiedTime(filePath));
        System.out.println("executable: "+Files.isExecutable(filePath));
        System.out.println("writable: "+Files.isWritable(filePath));
        System.out.println("readable: "+Files.isReadable(filePath));
    }
}
