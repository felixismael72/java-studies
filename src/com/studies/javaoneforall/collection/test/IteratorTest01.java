package com.studies.javaoneforall.collection.test;

import com.studies.javaoneforall.collection.domain.Manga;

import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();

        mangas.add(new Manga(4L, "Pokemon", 9.99, 0));
        mangas.add(new Manga(2L, "Attack on titan", 9.99, 5));
        mangas.add(new Manga(3L, "Dragon Ball Z", 9.99, 8));
        mangas.add(new Manga(1L, "One Piece", 9.99, 0));

        mangas.removeIf(manga -> manga.getQuantity() == 0);

        System.out.println(mangas);
    }
}
