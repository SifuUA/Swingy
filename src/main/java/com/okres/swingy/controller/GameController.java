package com.okres.swingy.controller;

import com.okres.swingy.model.Hero;

public class GameController {
    public GameController (Hero hero) {
        int i = 90;
        hero.setAge(i++);
        hero.setHealth(45);
    }

}
