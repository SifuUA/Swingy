package com.okres.swingy.model;

public class NewHero extends Character {
    public NewHero() {
    }

    @Override
    public void moveNorth() {

    }

    @Override
    public void moveSouth() {

    }

    @Override
    public void moveWest() {

    }

    @Override
    public void moveEast() {

    }

    @Override
    public void fight() {

    }

    @Override
    public void run() {

    }

    public NewHero(int id, String name, int age, String gender, String hero_class, int level, int experience, String attack, String defence) {
        super(id, name, age, gender, hero_class, level, experience, attack, defence);
    }

    public NewHero(String name, int age, String gender, String hero_class, int level, int experience, String attack, String defence) {
        super(name, age, gender, hero_class, level, experience, attack, defence);
    }

    public NewHero(String name, int age, String gender, String hero_class) {
        super(name, age, gender, hero_class);
    }
}
