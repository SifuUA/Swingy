package com.okres.swingy.view.console;

import com.okres.swingy.model.Hero;
import com.okres.swingy.util.DbConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class ConsolePaneController  {

    Connection connection;
    public static ArrayList<Hero> heroArrayList = new ArrayList<>();
    Hero hero;

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

    public boolean isDatabaseConnected() {
        return this.connection != null;
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
            if (idValidate(i)) {
                System.out.println(i);
            }else {
                printError();
            }
        }
    }

    private boolean idValidate(String i) {
        for (Hero hero : heroArrayList) {
            if (String.valueOf(hero.getId()).equals(i)) {
                return true;
            }
        }
        return false;
    }

    public void printError() {
        System.out.println("Error, please repeat.");
    }

    public void printMenu() {
        String a = String.format("%s\n%s\n%s\n%s",
                "If you want:", "Play game - input 1", "See score - input 2", "Exit - input 3");
        System.out.println(a);
    }
}