package com.studies.javaoneforall.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d - All the digits 0-9
        String regex = "\\d";
        String macAddress = "7B:87:F2:51:7A:42";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(macAddress);

        System.out.println("MAC:   "+macAddress);
        System.out.println("INDEX: 0123456789");

        while (matcher.find()) {
            System.out.println(matcher.start()+" "+matcher.group());
        }

        // \D - Everything that is not \d

        regex = "\\D";
        macAddress = "7B:87:F2:51:7A:42";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(macAddress);

        System.out.println("MAC:   "+macAddress);
        System.out.println("INDEX: 0123456789");

        while (matcher.find()) {
            System.out.println(matcher.start()+" "+matcher.group());
        }

        // \s - all the blank spaces \t \r \f \n

        regex = "\\s";
        macAddress = " 7B   :87 :F2 :51:7A:42   ";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(macAddress);

        System.out.println("MAC:   "+macAddress);
        System.out.println("INDEX: 0123456789");

        while (matcher.find()) {
            System.out.println(matcher.start()+" "+matcher.group());
        }

        // \S - everything that is not \s

        regex = "\\S";
        macAddress = "7B:87:F2:51:7A:42";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(macAddress);

        System.out.println("MAC:   "+macAddress);
        System.out.println("INDEX: 0123456789");

        while (matcher.find()) {
            System.out.println(matcher.start()+" "+matcher.group());
        }

        // \w - get a-z, A-Z, 0-9, _

        regex = "\\w";
        macAddress = "7B:87:F2:51: 7A: _42";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(macAddress);

        System.out.println("MAC:   "+macAddress);
        System.out.println("INDEX: 0123456789");

        while (matcher.find()) {
            System.out.println(matcher.start()+" "+matcher.group());
        }

        // \W - everything that is not \w

        regex = "\\W";
        macAddress = "7B:87:F2:51: 7A: _42";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(macAddress);

        System.out.println("MAC:   "+macAddress);
        System.out.println("INDEX: 0123456789");

        while (matcher.find()) {
            System.out.println(matcher.start()+" "+matcher.group());
        }
    }
}
