package com.okres.swingy.model;

public class Hero extends Character{

    public Hero(int id, String name, int age, String gender, String hero_class, int level, int experience, String attack, String defence) {
        super(id, name, age, gender, hero_class, level, experience, attack, defence);
    }

    public Hero(String name, int age, String gender, String hero_class, int level, int experience, String attack, String defence) {
        super(name, age, gender, hero_class, level, experience, attack, defence);
    }
}
