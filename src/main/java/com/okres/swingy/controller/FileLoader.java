package com.okres.swingy.controller;


import com.okres.swingy.model.Hero;
import com.okres.swingy.util.DbConnection;
import lombok.Getter;
import lombok.NonNull;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class FileLoader {

    private Connection connection;
    private BufferedReader bufferedReader;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;
    @Getter
    private List list;


    public void readFile() {
        @NonNull
        String line;

        try {
            connection = DbConnection.getConnection();
            bufferedReader = new BufferedReader(new FileReader("hero.txt"));
            preparedStatement = connection.prepareStatement(
                    "INSERT INTO heroes (name, age, gender, hero_class, " +
                            "level, experiance, attack, defence) " +
                            "VALUES (?,?,?,?,?,?,?,?)");
            while ((line = bufferedReader.readLine()) != null) {
                /*for (String i : line.split(","))
                {

                    new Hero(line.split(",",))
                }*/
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
