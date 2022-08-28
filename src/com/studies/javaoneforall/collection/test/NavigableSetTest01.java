package com.studies.javaoneforall.collection.test;

import com.studies.javaoneforall.collection.domain.Manga;
import com.studies.javaoneforall.collection.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneNameComparator implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class MangaPriceComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneNameComparator());
        set.add(new Smartphone("11111", "LG"));

        System.out.println(set);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPriceComparator());
        mangas.add(new Manga(4L, "Pokemon", 9.99, 0));
        mangas.add(new Manga(2L, "Attack on titan", 19.99, 5));
        mangas.add(new Manga(3L, "Dragon Ball Z", 29.99, 8));
        mangas.add(new Manga(1L, "One Piece", 39.99, 0));

        System.out.println("------------------");

        for (Manga manga : mangas.descendingSet()) {
            System.out.println(manga);
        }
    }
}
