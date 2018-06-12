package com.okres.swingy.controller;

import com.okres.swingy.model.Character;
import com.okres.swingy.model.Game;
import com.okres.swingy.model.Hero;

import javax.swing.*;
import java.util.List;

public class GameController {
    private List<Character> characters;
    private int arr[][];

    /*public GameController(Hero hero) {
    }
    public GameController(Hero hero, JLabel name, JLabel health, JLabel level, JLabel experience, JLabel coordinates) {
        name.setText("RRRRRRRRRRRRRRRRRRRRRR");
    }*/

    public int[][] createMap(int size) {
        arr = new int[size][size];
        return arr;
    }


    public void checkStep(int selectedIndex, Hero hero, int len) {

        if (isPossibleStep(hero, len)) {

            if (selectedIndex == 0) {
                hero.setY(hero.getY() + 1);
            } else if (selectedIndex == 1) {
                hero.setY(hero.getY() - 1);
            } else if (selectedIndex == 2) {
                hero.setX(hero.getX() + 1);
            } else
                hero.setX(hero.getX() - 1);
            System.out.println("X Y = " + hero.getX() + " " + hero.getY());
        } else {
            JOptionPane.showMessageDialog(null, "You are win!!!");
            System.out.println("Yoг are win!");
        }
    }

    private boolean isPossibleStep(Hero hero, int len) {
        System.out.println("AAAAAAA");
        if (hero.getX() > 0 && hero.getY() > 0 && hero.getX() < len &&
                hero.getY() < len)
            return true;
        return false;
    }
}