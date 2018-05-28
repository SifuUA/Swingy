package com.okres.swingy.util;

import com.okres.swingy.model.Character1;
import com.okres.swingy.model.Elf;

public class CharacterFactory {
    public static Character1 newCharacter(int id, String name, int age, String gender,
                                          String hero_class, int level,
                                          String expereance, String attack,
                                          String defence) {
        if (hero_class.equals("Elf"))
            return new Elf();
    }
}
