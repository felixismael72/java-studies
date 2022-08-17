package com.studies.javaoneforall.oop.association.test;

import com.studies.javaoneforall.oop.association.domain.Player;

public class PlayerTest01 {
    public static void main(String[] args) {
        Player p1 = new Player("Pelé");
        Player p2 = new Player("Romário");
        Player p3 = new Player("Cafu");

        Player[] players = {p1, p2, p3};
        for (Player player: players) {
            player.print();
        }
    }
}
