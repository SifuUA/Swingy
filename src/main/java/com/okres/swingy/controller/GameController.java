package com.okres.swingy.controller;

import com.okres.swingy.model.Character;
import com.okres.swingy.model.Hero;
import com.okres.swingy.model.items.RandomItems;

import javax.swing.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class GameController {
    private List<Character> characters;
    private Map arrObj= new HashMap();

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
        if (hero.getX() > 0 && hero.getY() > 0 && hero.getX() < len &&
                hero.getY() < len)
            return true;
        return false;
    }

    public void initializeMap() {
        this.arrObj.put(1, RandomItems.ARTIFACT);
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
    }

    public int  getRandomStepTruble() {
        initializeMap();
        Random random = new Random();
        int i = random.nextInt(16) + 1;
        System.out.println("random number = " + i);
        System.out.println(arrObj.get(i));
        return i;
    }

    public void fightImitattion(int i, Hero hero, JLabel jWindow, JButton jFight, JButton jRun, JComboBox jComboBox2) {
        Object obj = arrObj.get(i);
        if (obj.equals(RandomItems.STEP)) {
            jWindow.setText("STEP");
            jFight.setEnabled(false);
            jRun.setEnabled(false);
            jComboBox2.setEnabled(true);
        }else if (obj.equals(RandomItems.VILLIAN))
            jWindow.setText("VILLIAN");
        else if (obj.equals(RandomItems.BOSS))
            jWindow.setText("BOSS");
        else
            jWindow.setText("ARTIFACT");
    }

    public void runButton(Hero hero, int selectedIndex) {
        if (selectedIndex == 0) {
            hero.setY(hero.getY() - 1);
        } else if (selectedIndex == 1) {
            hero.setY(hero.getY() + 1);
        } else if (selectedIndex == 2) {
            hero.setX(hero.getX() - 1);
        } else
            hero.setX(hero.getX() + 1);
    }
}