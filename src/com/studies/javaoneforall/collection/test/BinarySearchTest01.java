package com.studies.javaoneforall.collection.test;

import com.studies.javaoneforall.collection.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);

        mangas.add(new Manga(5L, "Pokemon", 9.99));
        mangas.add(new Manga(3L, "Hellsing ultimate", 9.99));
        mangas.add(new Manga(1L, "Berserk", 9.99));
        mangas.add(new Manga(2L, "Attack on titan", 9.99));
        mangas.add(new Manga(4L, "Dragon Ball Z", 9.99));

        Comparator<Manga> mangaByTitleComparator = new MangaByTitleComparator();

        mangas.sort(mangaByTitleComparator);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        System.out.println("----------------------");
        Manga mangaToSearch = new Manga(4L, "Dragon Ball Z", 9.99);
        System.out.println(Collections.binarySearch(mangas, mangaToSearch, mangaByTitleComparator));
    }
}
