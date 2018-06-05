package com.okres.swingy.model;

import com.okres.swingy.model.items.Armor;
import com.okres.swingy.model.items.Weapon;

public class Hero extends Character{

    Weapon weapon;
    Armor armor;

    public Hero(int id, String name, int age, String gender, String hero_class, int level, int experience, String attack, String defence) {
        super(id, name, age, gender, hero_class, level, experience, attack, defence);
    }

    public Hero(String name, int age, String gender, String hero_class, int level, int experience, String attack, String defence) {
        super(name, age, gender, hero_class, level, experience, attack, defence);
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
}
