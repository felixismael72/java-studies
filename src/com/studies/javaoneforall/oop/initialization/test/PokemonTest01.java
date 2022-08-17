package com.studies.javaoneforall.oop.initialization.test;

import com.studies.javaoneforall.oop.initialization.domain.Pokemon;

public class PokemonTest01 {
    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon("Fire", "Charmander", 'M');

        pokemon.print();
    }
}
