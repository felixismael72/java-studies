package com.studies.javaoneforall.oop.association.test;

import com.studies.javaoneforall.oop.association.domain.Player;
import com.studies.javaoneforall.oop.association.domain.Team;

public class PlayerTest02 {
    public static void main(String[] args) {
        Player player = new Player("Pelé");
        player.setTeam(new Team("Brasil"));

        player.print();
    }
}
