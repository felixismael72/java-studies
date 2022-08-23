package com.studies.javaoneforall.nio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {
        Path folderPath = Paths.get("folder");
        if (Files.notExists(folderPath)) {
            Files.createDirectory(folderPath);
        }

        Path filePath = Paths.get(folderPath.toString(), "file.txt");
        if (Files.notExists(filePath)) {
            Files.createFile(filePath);
        }

        BasicFileAttributes basicFileAttributes = Files.readAttributes(filePath, BasicFileAttributes.class);

        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime();

        System.out.println("creation time: "+creationTime);
        System.out.println("last modified time: "+lastModifiedTime);
        System.out.println("last access time: "+lastAccessTime);

        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(filePath, BasicFileAttributeView.class);


        FileTime newLastAccess = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(null, newLastAccess,null);

        creationTime = fileAttributeView.readAttributes().creationTime();
        lastModifiedTime = fileAttributeView.readAttributes().lastModifiedTime();
        lastAccessTime = fileAttributeView.readAttributes().lastAccessTime();

        System.out.println("---------------");
        System.out.println("creation time: "+creationTime);
        System.out.println("last modified time: "+lastModifiedTime);
        System.out.println("last access time: "+lastAccessTime);
    }
}
