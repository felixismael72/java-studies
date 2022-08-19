package com.studies.javaoneforall.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // [] metacharacter
        // ? zero or one
        // * zero or more
        // + one or more
        // {0, 2}
        // ()
        // (a|s)
        // $ end of line
        String regex = "[a-cA-C]";
        String text = "cafeBABE";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Text:  "+text);
        System.out.println("Index: 012345678");

        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }

        // get hexadecimal numbers
        regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        text = "0x 0xF5 0xA3B 0x10G 0DST";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(text);

        System.out.println("Text:  "+text);
        System.out.println("Index: 012345678");

        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}
