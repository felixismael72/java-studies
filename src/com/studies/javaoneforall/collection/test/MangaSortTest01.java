package com.studies.javaoneforall.collection.test;

import com.studies.javaoneforall.collection.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(4);

        Manga m1 = new Manga(4L, "Pokemon", 9.99);
        Manga m2 = new Manga(2L, "Attack on titan", 9.99);
        Manga m3 = new Manga(3L, "Dragon Ball Z", 9.99);
        Manga m4 = new Manga(1L, "One Piece", 9.99);

        mangas.add(m1);
        mangas.add(m2);
        mangas.add(m3);
        mangas.add(m4);

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("------------------");

        Collections.sort(mangas);

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
