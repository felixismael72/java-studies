package com.studies.javaoneforall.utility.stringclass.test;

public class StringTest01 {
    public static void main(String[] args) {
        String name = " Luffy";
        System.out.println(name.charAt(0));
        System.out.println(name.length());
        System.out.println(name.equalsIgnoreCase(" luffy"));
        System.out.println(name.replace("f", "l"));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.substring(0, 3));
        System.out.println(name.trim());
    }
}
