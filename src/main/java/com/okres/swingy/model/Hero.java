package com.okres.swingy.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@Getter
@Setter
public class Hero {

    @NotNull
    private int id;
    @NotNull
    private String name;
    @NotNull
    private int age;
    @NotNull
    private String gender;
    @NotNull
    private String hero_class;
    @NotNull
    private int level;
    @NotNull
    private int experience;
    @NotNull
    private String attack;
    @NotNull
    private String defence;
}
