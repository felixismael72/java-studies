package com.studies.javaoneforall.exception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new IllegalArgumentException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Inside ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Inside IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Inside IllegalArgumentException");
        } catch (RuntimeException e) {
            System.out.println("Inside RuntimeException");
        }

        try {
            mayThrowException();
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void mayThrowException() throws SQLException, FileNotFoundException {

    }
}
