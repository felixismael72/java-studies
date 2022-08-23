package com.studies.javaoneforall.nio.test;

import java.io.IOException;
import java.nio.file.*;

public class PathTest02 {
    public static void main(String[] args) {
        Path folderPath = Paths.get("folder");

        try {
            if (Files.notExists(folderPath)) {
                Files.createDirectory(folderPath);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Path subFolderPath = Paths.get("folder/subfolder/subfolder2");

        try {
            Files.createDirectories(subFolderPath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Path filePath = Paths.get(subFolderPath.toString(), "file.txt");
        try {
            if (Files.notExists(filePath)) {
                Files.createFile(filePath);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Path target = Paths.get(filePath.getParent().toString(), "file_renamed.txt");

        try {
            Files.copy(filePath, target, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
