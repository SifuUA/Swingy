package com.okres.swingy.model;

public class Hero {

    private int id;
    private String name;
    private int age;
    private String gender;
    private String hero_class;

    public Hero(int id, String name, int age, String gender, String hero_class) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hero_class = hero_class;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHero_class() {
        return hero_class;
    }

    public void setHero_class(String hero_class) {
        this.hero_class = hero_class;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
