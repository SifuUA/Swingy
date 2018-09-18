package com.okres.swingy.view.console;

import com.okres.swingy.controller.GameController;
import com.okres.swingy.util.DbUtils;

import java.util.Scanner;

public class StartConsole {
    public void choose() {
        Scanner scanner = new Scanner(System.in);
        String a = String.format("%s\n%s\n%s\n%s",
                "If you want:", "Play game - input 1", "See score - input 2", "Exit - input 3");
        System.out.println(a);
        int i = scanner.nextInt();
        switch (i) {
            case 1:
                GameController gameController = new GameController();
                gameController.initializeMap();
                break;
            case 2:
                DbUtils dbUtils = new DbUtils();
                System.out.println(dbUtils.orderByScore());
                break;
            case 3:
                System.exit(1);
        }
    }
}
