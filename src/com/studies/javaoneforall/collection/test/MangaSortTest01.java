package com.studies.javaoneforall.collection.test;

import com.studies.javaoneforall.collection.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class MangaByTitleComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getTitle().compareTo(manga2.getTitle());
    }
}
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

        System.out.println("------------------");
        System.out.println("Not sorted: ");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("------------------");
        System.out.println("Sorted by ID: ");
        Collections.sort(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("------------------");
        System.out.println("Sorted by title: ");
        mangas.sort(new MangaByTitleComparator());
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
