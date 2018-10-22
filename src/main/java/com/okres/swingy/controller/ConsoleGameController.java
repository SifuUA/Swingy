package com.okres.swingy.controller;

import com.okres.swingy.model.Hero;
import com.okres.swingy.util.DbUtils;
import lombok.Getter;
import lombok.Setter;

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
            hero.setY(hero.getX() + 1);
        } else if (selectedIndex == 2) {
            hero.setY(hero.getX() - 1);
        } else if (selectedIndex == 3) {
            hero.setX(hero.getY() - 1);
        } else
            hero.setX(hero.getY() + 1);
        System.out.println("X Y = " + hero.getX() + " " + hero.getY());
        if (!isPossibleStep(hero, len)) {
            System.out.println(("Yoг are win!"));
            new DbUtils().updateHero(hero);
            System.exit(1);
        }
    }
}
