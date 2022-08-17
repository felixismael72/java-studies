package com.studies.javaoneforall.oop.overload.test;

import com.studies.javaoneforall.oop.overload.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("One Piece", "TV", 12, "In progress");
        anime.print();
    }
}
