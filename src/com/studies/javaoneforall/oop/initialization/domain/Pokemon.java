package com.studies.javaoneforall.oop.initialization.domain;

public class Pokemon {
    private String type;
    private String name;
    private final String[] defaultAttack;
    private char gender;

    {
        this.defaultAttack = new String[]{"Tackle", "Growl"};
    }

    public Pokemon(String type, String name, char gender) {
        this();
        this.type = type;
        this.name = name;
        this.gender = gender;
    }

    public Pokemon() {
    }

    public void print() {
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.gender);
        for (String attack: this.defaultAttack) {
            System.out.println(attack);
        }
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String[] getDefaultAttack() {
        return defaultAttack;
    }

    public char getGender() {
        return gender;
    }
}
