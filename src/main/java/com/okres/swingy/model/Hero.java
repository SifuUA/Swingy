package com.okres.swingy.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
public class Hero {

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

    public Hero(String name, int age, String gender, String hero_class, int level, int experience, String attack, String defence) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hero_class = hero_class;
        this.level = level;
        this.experience = experience;
        this.attack = attack;
        this.defence = defence;
    }
}
