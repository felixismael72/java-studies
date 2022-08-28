package com.studies.javaoneforall.collection.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> onePieceMap = new LinkedHashMap<>();

        onePieceMap.put("Captain", "Luffy");
        onePieceMap.put("Swordsman", "Zoro");
        onePieceMap.put("Navigator", "Nami");
        onePieceMap.put("Cooker", "Sanji");
        onePieceMap.put("Doctor", "Chopper");
        onePieceMap.put("Archaeologist", "Nico Robin");
        onePieceMap.put("Builder", "Franky");
        onePieceMap.put("Musician", "Brook");
        onePieceMap.put("Helmsman", "Jinbe");

        for(Map.Entry<String, String> entry: onePieceMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
