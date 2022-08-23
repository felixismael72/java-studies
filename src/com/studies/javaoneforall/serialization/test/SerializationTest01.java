package com.studies.javaoneforall.serialization.test;

import com.studies.javaoneforall.serialization.domain.Student;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationTest01 {
    public static void main(String[] args) {
        Student student = new Student(1L, "Luffy", "123456");
        serialize(student);
        deserialize();
    }

    private static void serialize(Student student) {
        Path path = Paths.get("folder/student.ser");
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deserialize() {
        Path path = Paths.get("folder/student.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            Student student = (Student) ois.readObject();
            System.out.println(student);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
