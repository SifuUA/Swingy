package com.okres.swingy.controller;

import com.okres.swingy.model.Hero;
import com.okres.swingy.model.items.RandomItems;
import com.okres.swingy.util.DbUtils;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConsoleGameController extends GameController {
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

    public void consoleFightImitattion(Hero hero, Scanner sc) {
        obj = arrObj.get(map[hero.getX()][hero.getY()]);
        int i = (int) (1 + Math.random() * 2);
        int j;
        if (obj.equals(RandomItems.STEP)) {
            System.out.println("You are were very lucky you did not meet anyone on your way! " +
                    " Go further!");
        } else if (obj.equals(RandomItems.VILLIAN)) {
            System.out.println("Unexpectedly on the road appeared villain ");
            System.out.println("You have to options:\n Fight -> input 1\n Run -> input 2 ");
            while (sc.hasNext()) {
                String str = sc.next();
                if (str.equals("1") || str.equals("2")) {
                    j = Integer.parseInt(str);
                    if (j == 1)
                        fight(hero, i);
                    else
                        run(hero);
                    System.out.println(
                            "Move East -> input 1\n" +
                                    "Move West -> input 2\n" +
                                    "Move South -> input 3\n" +
                                    "Move North -> input 4");
                    break;
                } else {
                    System.out.println("Error input!");
                }
            }

        } else if (obj.equals(RandomItems.BOSS)) {
            System.out.println("In front of you appears a huge orc the size of a five-story building\n" +
                    "and you understand that the battle will not be easy ... ");
            fightBoos(hero);
        } else {
            System.out.println("With your sharp eyesight not far under the tree, you saw a bottle of blue liquid " +
                    "and something inside told you that it's worth it to drink .... + 10HP!</html>");
            if (hero.getHealth() < 100)
                hero.setHealth(hero.getHealth() + 10);
            map[hero.getX()][hero.getY()] = 3;
        }
    }

    private void run(Hero hero) {

        int i = (int) (1 + Math.random() * 2);
        if (i == 1) {
            if (obj.equals(RandomItems.VILLIAN)) {
                System.out.println("You so quickly ran away that you overtook the marathon runners well\n " +
                        "and at the same time ran away from the villain");
            } else {
                System.out.println("You were lucky you managed to escape!");
            }
        } else {
            if (obj.equals(RandomItems.VILLIAN))
                fight(hero, 1);
            else
                fightBoos(hero);
        }
        checkHealth(hero);
        checkLevel(hero);
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
            //System.out.println(Arrays.toString(map[i]));
        }
        //System.out.println("First center position X = " + hero.getX() + " " + "Y = " + hero.getY());
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
    }

    public void fight(Hero hero, int flag) {
        int i = (int) (1 + Math.random() * 2);
        if (i == 1) {
            hero.setHealth(hero.getHealth() - 20);
            if (flag != 1) {
                System.out.println("It was very dangerous fight but you could win" +
                        " but the enemy did it to you - 20 HP");
                map[hero.getX()][hero.getY()] = 3;
            } else {
                System.out.println("Unfortunately you cant escape from villain and must fight." +
                        "He damaged you - 20 HP");
            }
            if (hero.getLevel() == 0)
                hero.setExperience(hero.getExperience() + 500);
            else
                hero.setExperience(hero.getExperience() + 200);
        } else {
            if (flag != 1) {
                System.out.println("You are very easy to defeat the villain. " +
                        "It's good that you did not get caught by the BOSS!");
                map[hero.getX()][hero.getY()] = 3;
            } else
                System.out.println("Unfortunately you cant escape from villain and must fight. But you was so amazing " +
                        "and he did not hurt you!");
            map[hero.getX()][hero.getY()] = 3;
            if (hero.getLevel() == 0)
                hero.setExperience(hero.getExperience() + 500);
            else
                hero.setExperience(hero.getExperience() + 200);
        }
        checkHealth(hero);
        checkLevel(hero);
        //System.out.println("Fight");
    }

    public void checkHealth(Hero hero) {
        if (hero.getHealth() <= 0) {
            System.out.println("Your health is " +
                    hero.getHealth() + " \nGame over :(");
            System.exit(0);
        }
    }

    public void checkLevel(Hero hero) {
        int scoreOfNextLevel = (int) ((hero.getLevel() + 1) * 1000 + Math.pow((hero.getLevel() + 1 - 1), 2) * 450);
        if (hero.getExperience() >= scoreOfNextLevel && hero.getExperience() >= 1000)
            hero.setLevel(hero.getLevel() + 1);
       /* System.out.println("Next level " + scoreOfNextLevel);
        System.out.println("Experiance" + hero.getExperience());*/
    }

    public void fightBoos(Hero hero) {
        if (hero.getLevel() <= 3) {
            System.out.println("The huge Orc was too strong and knocked you out with a club the size of a house!" +
                    " Maybe you still need to raise the level ...");
            hero.setHealth(hero.getHealth() - 1000);
            checkHealth(hero);
        } else if (hero.getLevel() <= 7) {
            int i = (int) (1 + Math.random() * 2);
            if (i == 1) {
                System.out.println("Although the Orc was big and dangerous, you could defeat it!" +
                        "You gain an artifact - piece of Orc`s ear which give you +50 HP");
                map[hero.getY()][hero.getY()] = 3;
                hero.setHealth(hero.getHealth() + 50);
                if (hero.getHealth() > 100)
                    hero.setHealth(100);
            } else {
                System.out.println("You bravely fought but missed one crushing blow " +
                        "when the orc was already mortally wounded ... -70 HP");
                map[hero.getY()][hero.getY()] = 3;
                hero.setHealth(hero.getHealth() - 70);
                checkHealth(hero);
            }
        }
    }
}
