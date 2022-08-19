package com.studies.javaoneforall.utility.stringclass.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String name = "Monkey D.";

        StringBuilder sb = new StringBuilder("Monkey D.");
        sb.append(" Luffy");
        sb.reverse();
        sb.delete(0, 3);
        System.out.println(sb);
    }
}
