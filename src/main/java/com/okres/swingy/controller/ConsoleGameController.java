package com.okres.swingy.controller;

import com.okres.swingy.model.Hero;
import com.okres.swingy.model.items.RandomItems;
import com.okres.swingy.util.DbUtils;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ConsoleGameController extends GameController{
    private Map arrObj = new HashMap();
    private Object obj;

    @Getter
    @Setter
    private int map[][];

    public void checkStep(int selectedIndex, Hero hero, int len) {
        if (selectedIndex == 1) {
            hero.setY(hero.getY() + 1);
        } else if (selectedIndex == 2) {
            hero.setY(hero.getY() - 1);
        } else if (selectedIndex == 3) {
            hero.setX(hero.getX() - 1);
        } else
            hero.setX(hero.getX() + 1);
        System.out.println("X Y = " + hero.getX() + " " + hero.getY());
        if (!isPossibleStep(hero, len)) {
            System.out.println(("Yoг are win!"));
            new DbUtils().updateHero(hero);
            System.exit(1);
        }
    }

    public void consoleFightImitattion(Hero hero) {
        obj = arrObj.get(map[hero.getX()][hero.getY()]);

        if (obj.equals(RandomItems.STEP)) {
            System.out.println("You are were very lucky you did not meet anyone on your way! " +
                    " Go further!");
        } else if (obj.equals(RandomItems.VILLIAN)) {
            System.out.println("Unexpectedly on the road appeared villain, you have 2 options to try to escape" +
                    " hoping for luck or in battle show all your skills!");
        } else if (obj.equals(RandomItems.BOSS))
            System.out.println("In front of you appears a huge orc the size of a five-story building " +
                    "and you understand that the battle will not be easy ... " +
                    "but you can try escape ...");
        else {
            System.out.println("With your sharp eyesight not far under the tree, you saw a bottle of blue liquid " +
                    "and something inside told you that it's worth it to drink .... + 10HP!</html>");
            if (hero.getHealth() < 100)
                hero.setHealth(hero.getHealth() + 10);
            map[hero.getX()][hero.getY()] = 3;
        }
    }

    public void consoleVilainGen(Hero hero) {

        map = new int[((hero.getLevel() - 1) * 5 + 10 - (hero.getLevel() % 2))]
                [((hero.getLevel() - 1) * 5 + 10 - (hero.getLevel() % 2))];
        //System.out.println("Map = " + map.length);
        hero.setX(map.length / 2);
        hero.setY(map.length / 2);
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (i == hero.getY() && j == hero.getX()) {
                    map[i][j] = 3;
                    continue;
                } else
                    map[i][j] = getRandomStepTruble();
            }
            System.out.println(Arrays.toString(map[i]));
        }
        System.out.println("First center position X = " + hero.getX() + " " + "Y = " + hero.getY());
    }

    public void initializeMap() {
    arrObj.put(1, RandomItems.ARTIFACT);
        this.arrObj.put(2, RandomItems.VILLIAN);
        this.arrObj.put(3, RandomItems.STEP);
        this.arrObj.put(4, RandomItems.VILLIAN);
        this.arrObj.put(5, RandomItems.STEP);
        this.arrObj.put(6, RandomItems.STEP);
        this.arrObj.put(7, RandomItems.VILLIAN);
        this.arrObj.put(8, RandomItems.STEP);
        this.arrObj.put(9, RandomItems.VILLIAN);
        this.arrObj.put(10, RandomItems.STEP);
        this.arrObj.put(11, RandomItems.BOSS);
        this.arrObj.put(12, RandomItems.STEP);
        this.arrObj.put(13, RandomItems.STEP);
        this.arrObj.put(14, RandomItems.VILLIAN);
        this.arrObj.put(15, RandomItems.STEP);
        this.arrObj.put(16, RandomItems.VILLIAN);
}}
