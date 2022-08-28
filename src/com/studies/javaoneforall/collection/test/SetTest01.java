package com.studies.javaoneforall.collection.test;

import com.studies.javaoneforall.collection.domain.Manga;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new LinkedHashSet<>();

        mangas.add(new Manga(4L, "Pokemon", 9.99, 0));
        mangas.add(new Manga(2L, "Attack on titan", 9.99, 5));
        mangas.add(new Manga(3L, "Dragon Ball Z", 9.99, 8));
        mangas.add(new Manga(1L, "One Piece", 9.99, 0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
