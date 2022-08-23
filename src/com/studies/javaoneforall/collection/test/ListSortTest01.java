package com.studies.javaoneforall.collection.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>();

        mangas.add("Pokemon");
        mangas.add("Attack on titan");
        mangas.add("Dragon Ball Z");
        mangas.add("One Piece");

        System.out.println(mangas);

        Collections.sort(mangas);

        System.out.println(mangas);
    }
}
