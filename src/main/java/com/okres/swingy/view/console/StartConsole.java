package com.okres.swingy.view.console;

import java.util.Scanner;

public class StartConsole {
    public void choose() {
        Scanner scanner = new Scanner(System.in);
        String a = String.format("%s\n%s\n%s\n%s",
                "If you want:", "Play game - input 1", "See score - input 2", "Exit - input 3");
        System.out.println(a);
        int i = scanner.nextInt();
    }
}
