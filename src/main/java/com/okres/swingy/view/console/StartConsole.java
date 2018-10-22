package com.okres.swingy.view.console;

import com.okres.swingy.controller.ConsoleGameController;
import com.okres.swingy.controller.ConsolePaneController;
import com.okres.swingy.controller.GameController;
import com.okres.swingy.util.DbUtils;

import java.sql.SQLException;
import java.util.Scanner;

public class StartConsole {
    private GameController gameController = new GameController();
    private ConsolePaneController paneController = new ConsolePaneController();
    private ConsoleGameController consoleGameContgroller = new ConsoleGameController();

    public void choose() {
        Scanner scanner = new Scanner(System.in);
        paneController.printMenu();
        while (scanner.hasNext()) {
            String j = scanner.next();
            if (!j.equals("1") && !j.equals("2") && !j.equals("3")) {
                paneController.printError();
                paneController.printMenu();
                continue;
            }
            int i = Integer.parseInt(j);
            switch (i) {
                case 1:
                    consoleGameContgroller.initializeMap();
                    try {
                        paneController.heroNameList();
                        paneController.printHeroes();
                        paneController.getIdOfHero();
                        paneController.gameProcess();

                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    System.out.println("Score Of the heroes:");
                    DbUtils dbUtils = new DbUtils();
                    System.out.println(dbUtils.orderByScore());
                    paneController.printMenu();
                    break;
                case 3:
                    System.exit(1);
            }
        }
    }


}
