package com.okres.swingy.controller;

import com.okres.swingy.model.Hero;
import com.okres.swingy.model.items.RandomItems;
import com.okres.swingy.util.DbUtils;
import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.util.*;

public class GameController {

    private Map arrObj = new HashMap();
    private Object obj;
    @Getter
    @Setter
    private int map[][];


    public void checkStep(int selectedIndex, Hero hero, int len) {

        if (selectedIndex == 0) {
            hero.setY(hero.getY() + 1);
        } else if (selectedIndex == 1) {
            hero.setY(hero.getY() - 1);
        } else if (selectedIndex == 2) {
            hero.setX(hero.getX() + 1);
        } else
            hero.setX(hero.getX() - 1);
        System.out.println("X Y = " + hero.getX() + " " + hero.getY());
        if (!isPossibleStep(hero, len)) {
            JOptionPane.showMessageDialog(null, "You are win!!!");
            System.out.println("Yoг are win!");
            new DbUtils().updateHero(hero);
            System.exit(1);
        }
    }

    protected boolean isPossibleStep(Hero hero, int len) {
        if (hero.getX() >= 0 && hero.getY() >= 0 && hero.getX() <= len - 1 &&
                hero.getY() <= len - 1)
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

    public int getRandomStepTruble() {
        initializeMap();
        Random random = new Random();
        int i = random.nextInt(16) + 1;
//        System.out.println("random number = " + i);
//        System.out.println(arrObj.get(i));
        return i;
    }

    public void fightImitattion(Hero hero, JLabel jWindow, JButton jFight, JButton jRun, JComboBox jComboBox2) {
        obj = arrObj.get(map[hero.getX()][hero.getY()]);

        if (obj.equals(RandomItems.STEP)) {
            jWindow.setText("<html>You are were very lucky you did not meet anyone on your way!<br/> " +
                    " Go further!</html>");
            jFight.setEnabled(false);
            jRun.setEnabled(false);
            jComboBox2.setEnabled(true);
        } else if (obj.equals(RandomItems.VILLIAN)) {
            jWindow.setText("<html>Unexpectedly on the road appeared villain, you have 2 options to try to escape" +
                    " hoping for luck or in battle show all your skills!</html>");
        } else if (obj.equals(RandomItems.BOSS))
            jWindow.setText("<html>In front of you appears a huge orc the size of a five-story building " +
                    "and you understand that the battle <br/>will not be easy ... " +
                    "but you can try escape ...</html>");
        else {
            jWindow.setText("<html>With your sharp eyesight not far under the tree, you saw a bottle of blue liquid " +
                    "and something inside told you that it's worth it to drink .... + 10HP!</html>");
            if (hero.getHealth() < 100)
                hero.setHealth(hero.getHealth() + 10);
            map[hero.getX()][hero.getY()] = 3;
            jFight.setEnabled(false);
            jRun.setEnabled(false);
            jComboBox2.setEnabled(true);
        }
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

    /*
     * Create map, vilains, and adjustment they on map
     */
    public void vilainGen(Hero hero) {

        map = new int[((hero.getLevel() - 1) * 5 + 10 - (hero.getLevel() % 2))]
                [((hero.getLevel() - 1) * 5 + 10 - (hero.getLevel() % 2))];
        System.out.println("Map = " + map.length);
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

    public void fight(Hero hero, JLabel window, JLabel health, JLabel level, JLabel score, int flag) {
        int i = (int) (1 + Math.random() * 2);
        if (i == 1) {
            hero.setHealth(hero.getHealth() - 20);
            if (flag != 1) {
                window.setText("<html>It was very dangerous fight but you could win" +
                        " but the enemy did it to you - 20 HP</html>");
                map[hero.getX()][hero.getY()] = 3;
            } else {
                window.setText("<html>Unfortunately you cant escape from villain and must fight." +
                        "He damaged you - 20 HP");
            }
            if (hero.getLevel() == 0)
                hero.setExperience(hero.getExperience() + 500);
            else
                hero.setExperience(hero.getExperience() + 200);
        } else {
            if (flag != 1) {
                window.setText("<html>You are very easy to defeat the villain. " +
                        "It's good that you did not get caught by the BOSS!</html>");
                map[hero.getX()][hero.getY()] = 3;
            } else
                window.setText("<html>Unfortunately you cant escape from villain and must fight. But you was so amazing " +
                        "and he did not hurt you!");
            map[hero.getX()][hero.getY()] = 3;
            if (hero.getLevel() == 0)
                hero.setExperience(hero.getExperience() + 500);
            else
                hero.setExperience(hero.getExperience() + 200);
        }
        score.setText(String.valueOf(hero.getExperience()));
        health.setText(String.valueOf(hero.getHealth()));
        checkHealth(hero);
        checkLevel(hero);
        level.setText(String.valueOf(hero.getLevel()));
        //System.out.println("Fight");
    }

    public void checkHealth(Hero hero) {
        if (hero.getHealth() <= 0) {
            JOptionPane.showMessageDialog(null, "Your health is " +
                    hero.getHealth() + " \nGame over :(");
            System.exit(0);
        }
    }

    public void checkLevel(Hero hero) {
        int scoreOfNextLevel = (int) ((hero.getLevel() + 1) * 1000 + Math.pow((hero.getLevel() + 1 - 1), 2) * 450);
        if (hero.getExperience() >= scoreOfNextLevel && hero.getExperience() >= 1000)
            hero.setLevel(hero.getLevel() + 1);
        System.out.println("Next level " + scoreOfNextLevel);
        System.out.println("Experiance" + hero.getExperience());
    }

    public void run(Hero hero, JLabel window, JLabel health, JLabel level, JLabel score) {
        int i = (int) (1 + Math.random() * 2);
        if (i == 1) {
            if (obj.equals(RandomItems.VILLIAN)) {
                window.setText("<html>You so quickly ran away that you overtook the marathon runners well " +
                        "and at the same time ran away from the villain</html>");
            }else {
                window.setText("<html>You were lucky you managed to escape!</html>");
            }
        } else {
            if (obj.equals(RandomItems.VILLIAN))
                fight(hero, window, health, level, score, 1);
            else
                fightBoos(hero, window, health, level, score);
        }
        score.setText(String.valueOf(hero.getExperience()));
        health.setText(String.valueOf(hero.getHealth()));
        checkHealth(hero);
        checkLevel(hero);
        level.setText(String.valueOf(hero.getLevel()));
    }

    public void fightBoos(Hero hero, JLabel jLabel1, JLabel jLabel18, JLabel jLabel19, JLabel jLabel20) {
        if (hero.getLevel() <= 3) {
            jLabel1.setText("<html>The huge Orc was too strong and knocked you out with a club the size of a house!" +
                    " Maybe you still need to raise the level ...</html>");
            hero.setHealth(hero.getHealth() - 1000);
            jLabel18.setText(String.valueOf(hero.getHealth()));
            checkHealth(hero);
        } else if (hero.getLevel() <= 7) {
            int i = (int) (1 + Math.random() * 2);
            if (i == 1) {
                jLabel1.setText("<html>Although the Orc was big and dangerous, you could defeat it!" +
                        "You gain an artifact - piece of Orc`s ear which give you +50 HP </html>");
                map[hero.getY()][hero.getY()] = 3;
                hero.setHealth(hero.getHealth() + 50);
                if (hero.getHealth() > 100)
                    hero.setHealth(100);
            } else {
                jLabel1.setText("<html>You bravely fought but missed one crushing blow " +
                        "when the orc was already mortally wounded ... -70HP</html>");
                map[hero.getY()][hero.getY()] = 3;
                hero.setHealth(hero.getHealth() - 70);
                checkHealth(hero);
            }
        }
    }

    public void scoreStabilizatio(Hero hero) {
        if (hero.getLevel() > 0) {
            int score = (int) (hero.getLevel() * 1000 + Math.pow((hero.getLevel() - 1), 2) * 450);
            if (hero.getExperience() < score)
                hero.setExperience(score);
        }
    }
}