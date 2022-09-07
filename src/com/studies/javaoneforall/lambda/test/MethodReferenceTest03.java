package com.studies.javaoneforall.lambda.test;

import com.studies.javaoneforall.lambda.domain.Anime;
import com.studies.javaoneforall.lambda.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest03 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> animeComparatorsSupplier = AnimeComparators::new;
        AnimeComparators animeComparators = animeComparatorsSupplier.get();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 40), new Anime("One piece", 1028), new Anime("Naruto", 500)));
        animeList.sort(animeComparators::compareByEpisode);
        BiFunction<String, Integer, Anime> animeBiFunction = Anime::new;
        System.out.println(animeBiFunction.apply("Saint Seiya", 100));
    }
}
