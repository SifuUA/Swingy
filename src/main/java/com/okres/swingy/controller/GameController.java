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

    public void createMap(int size){
        arr = new int [size][size];
    }


    public void checkStep(int selectedIndex, Hero hero) {
        if (isPossibleStep(hero))
        {
            if (selectedIndex == 0)
            {
                hero.setY(hero.getY() + 1);
            }
            else if (hero.)
        }
    }

    private boolean isPossibleStep(Hero hero) {
        if (hero.getX() > 0 && hero.getY() > 0 && hero.getX() < arr.length &&
                hero.getY() < arr.length)
            return true;
        return false;
    }
}