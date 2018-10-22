package com.okres.swingy.controller;

import com.okres.swingy.model.Hero;
import com.okres.swingy.util.DbConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class ConsolePaneController {

    private GameController gameController = new GameController();
    private ConsoleGameController consoleGameController = new ConsoleGameController();

    private Connection connection;
    public static ArrayList<Hero> heroArrayList = new ArrayList<>();
    private Hero hero;

    public ConsolePaneController() {
        try {
            this.connection = DbConnection.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (this.connection == null) {
            System.exit(1);
        }
    }

    public void heroNameList() throws SQLException {

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * from main.heroes");

        while (resultSet.next()) {
            hero = new Hero(Integer.parseInt(resultSet.getString(1)),
                    resultSet.getString(2),
                    Integer.parseInt(resultSet.getString(3)),
                    resultSet.getString(4),
                    resultSet.getString(5),
                    Integer.parseInt(resultSet.getString(6)),
                    Integer.parseInt(resultSet.getString(7)),
                    resultSet.getString(8),
                    resultSet.getString(9));
            heroArrayList.add(hero);
        }
        resultSet.close();
        statement.close();
    }

    public void printHeroes() {
        StringBuilder str = new StringBuilder();
        for (Hero hero : heroArrayList) {
            str.append("Id: ").append(hero.getId()).append("| ").
                    append("Name: ").append(hero.getName()).append("| ").
                    append("Age: ").append(String.valueOf(hero.getAge())).append("| ").
                    append("Level: ").append(String.valueOf(hero.getLevel())).append("| ").
                    append("Experience: ").append(String.valueOf(hero.getExperience()));
            System.out.println(str);
            str = new StringBuilder();
        }
    }

    public void getIdOfHero() {
        System.out.println("\nPlease enter the id of the chosen hero:");
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String i = scanner.next();
            if ((hero = idValidate(i)) != null) {
                //System.out.println(hero);
                gameController.scoreStabilizatio(hero);
                break;
            } else {
                printError();
            }
        }
    }

    private Hero idValidate(String i) {
        for (Hero hero : heroArrayList) {
            if (String.valueOf(hero.getId()).equals(i)) {
                return hero;
            }
        }
        return null;
    }

    public void printError() {
        System.out.println("Error, please repeat.");
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printMenu() {
        String a = String.format("%s\n%s\n%s\n%s",
                "If you want:", "Play game - input 1", "See score - input 2", "Exit - input 3");
        System.out.println(a);
    }

    public void printStatus() {
        StringBuilder sb = new StringBuilder();
        sb.
                append("Name: ").append(hero.getName()).append("| ").
                append("Health: ").append(String.valueOf(hero.getHealth())).append("| ").
                append("Level: ").append(String.valueOf(hero.getLevel())).append("| ").
                append("Experience: ").append(String.valueOf(hero.getExperience()));
        System.out.println(sb);
    }

    public void gameProcess() {
        Scanner sc = new Scanner(System.in);
        int tmp = 0;
        printMessage("Welcome to the Game!!!\nYou are in the center of the dark wood " +
                "\nand your goal is to find road from it." +
                "\nChoose direction ang game will begin." +
                "\nGood luck!\n");
        consoleGameController.consoleVilainGen(hero);
        printMoveMessage();
        while (sc.hasNext() && hero.getHealth() > 0) {
            if (tmp++ != 0)
                printMoveMessage();
            String step = sc.next();
            if (step.equals("1") ||
                    step.equals("2") ||
                    step.equals("3") ||
                    step.equals("4")) {
                int i = Integer.parseInt(step);
                printStatus();
                consoleGameController.checkStep(i, hero, consoleGameController.getMap().length);
                consoleGameController.consoleFightImitattion(hero, sc);
                consoleGameController.checkHealth(hero);
            } else {
                printError();
                System.out.println("");
                printMoveMessage();
            }
        }
    }

    private void printMoveMessage() {
            System.out.println(
                    "Move East -> input 1\n" +
                            "Move West -> input 2\n" +
                            "Move South -> input 3\n" +
                            "Move North -> input 4");
    }


}
