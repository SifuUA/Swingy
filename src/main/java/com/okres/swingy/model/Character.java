package com.okres.swingy.model;

import com.okres.swingy.model.items.Armor;
import com.okres.swingy.model.items.Weapon;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@ToString
public abstract class Character {

    @NotNull
    private int id;
    @NotNull
    private String name;
    @NotNull
    @Digits(integer = 100, fraction = 0)
    private int age;
    @NotNull
    private String gender;
    @NotNull
    private String hero_class;
    @NotNull
    private int level;
    @NotNull
    private int experience;
    @NotNull
    private String attack;
    @NotNull
    private String defence;

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Character(String name, int age, String gender, String hero_class, int level, int experience, String attack, String defence) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hero_class = hero_class;
        this.level = level;
        this.experience = experience;
        this.attack = attack;
        this.defence = defence;
    }

    public Character(String name, int age, String gender, String hero_class) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hero_class = hero_class;
    }

    public Character() {
    }
     public abstract void moveNorth();
     public abstract void moveSouth();
     public abstract void moveWest();
     public abstract void moveEast();
     public abstract void fight();
     public abstract void run();
}
