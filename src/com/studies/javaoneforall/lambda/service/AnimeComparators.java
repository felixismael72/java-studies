package com.studies.javaoneforall.lambda.service;

import com.studies.javaoneforall.lambda.domain.Anime;

public class AnimeComparators {
    public static int compareByTitle(Anime a1, Anime a2) {
        return a1.getTitle().compareTo(a2.getTitle());
    }

    public int compareByEpisode(Anime a1, Anime a2) {
        return Integer.compare(a1.getEpisode(), a2.getEpisode());
    }
}
