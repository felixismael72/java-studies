package com.studies.javaoneforall.lambda.test;

import com.studies.javaoneforall.lambda.domain.Anime;
import com.studies.javaoneforall.lambda.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 40), new Anime("One piece", 1028), new Anime("Naruto", 500)));
        AnimeComparators animeComparators = new AnimeComparators();
        animeList.sort(animeComparators::compareByEpisode);
        System.out.println(animeList);
    }
}
