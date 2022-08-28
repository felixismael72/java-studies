package com.studies.javaoneforall.collection.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<String, String> alphabetMap = new TreeMap<>();

        alphabetMap.put("A", "Letter A");
        alphabetMap.put("B", "Letter B");
        alphabetMap.put("C", "Letter C");
        alphabetMap.put("D", "Letter D");
        alphabetMap.put("E", "Letter E");

        for (Map.Entry<String, String> entry: alphabetMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
