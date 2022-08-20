package com.studies.javaoneforall.io.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) {
        File fileFolder = new File("folder");
        boolean isFolderCreated = fileFolder.mkdir();
        System.out.println("is folder created: "+isFolderCreated);

        File file = new File(fileFolder, "file.txt");
        try {
            boolean isFileCreated = file.createNewFile();
            System.out.println("is file created: "+isFileCreated);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File fileRenamed = new File(fileFolder,"file_renamed.txt");
        boolean isFileRenamed = file.renameTo(fileRenamed);
        System.out.println("is file renamed: "+isFileRenamed);

        File fileFolderRenamed = new File("folder2");
        boolean isFolderRenamed = fileFolder.renameTo(fileFolderRenamed);
        System.out.println("is folder renamed: "+isFolderRenamed);
    }
}
