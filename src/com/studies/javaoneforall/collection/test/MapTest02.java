package com.studies.javaoneforall.collection.test;

import com.studies.javaoneforall.collection.domain.Customer;
import com.studies.javaoneforall.collection.domain.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Business Customer1");
        Customer customer2 = new Customer("Business Customer2");

        Manga manga1 = new Manga(5L, "Pokemon", 19.99);
        Manga manga2 = new Manga(3L, "Hellsing Ultimate", 59.99);
        Manga manga3 = new Manga(1L, "Berserk", 29.99);
        Manga manga4 = new Manga(2L, "Attack on titan", 39.99);
        Manga manga5 = new Manga(4L, "Dragon Ball Z", 89.99);

        Map<Customer, List<Manga>> customerMangaMap = new HashMap<>();
        List<Manga> customer1Mangas = List.of(manga1, manga2);
        List<Manga> customer2Mangas = List.of(manga3, manga4, manga5);

        customerMangaMap.put(customer1, customer1Mangas);
        customerMangaMap.put(customer2, customer2Mangas);

        for (Map.Entry<Customer, List<Manga>> entry : customerMangaMap.entrySet()) {
            System.out.println("-----------------------");
            System.out.println("Customer: ");
            System.out.println("---> " + entry.getKey().getName());
            System.out.println("Manga List: ");
            for (Manga manga : entry.getValue()) {
                System.out.println("---> " + manga.getTitle());
            }
            System.out.println();
        }

    }
}
