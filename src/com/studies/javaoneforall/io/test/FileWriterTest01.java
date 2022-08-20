package com.studies.javaoneforall.io.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.text");
        try (FileWriter fw = new FileWriter(file)) {
            fw.write("This is a message written by a program <3\nThis is a new nice line");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
