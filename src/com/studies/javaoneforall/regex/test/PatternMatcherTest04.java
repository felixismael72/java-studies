package com.studies.javaoneforall.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String text = "luffy@hotmail.com, #zoro@mail.com, test@gmail.com sakura@mail";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Text:  "+text);
        System.out.println("Index: 012345678");
        System.out.println("Regex: "+regex);

        while (matcher.find()) {
            System.out.println(matcher.start()+" "+matcher.group());
        }
    }
}
