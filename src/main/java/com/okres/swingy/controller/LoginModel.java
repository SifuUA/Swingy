package com.okres.swingy.controller;

import com.okres.swingy.model.Hero;
import com.okres.swingy.util.DbConnection;

import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class LoginModel {

    Connection connection;
    ArrayList<Hero> heroArrayList = new ArrayList<>();
    Hero hero;

    public LoginModel() {
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

    public void heroNameList(JList jList, String query) throws SQLException {

        DefaultListModel model = new DefaultListModel();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

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
            model.addElement(hero.getName());
            heroArrayList.add(hero);
        }
        jList.setModel(model);
        resultSet.close();
        statement.close();
    }

    public void putOnTextErea(JTextArea jTextArea1, int id) throws SQLException {
        jTextArea1.setText("");
        Hero hero = heroArrayList.get(id);

        jTextArea1.append("Name: " + hero.getName() + "\n");
        jTextArea1.append("Age: " + String.valueOf(hero.getAge()) + "\n");
        jTextArea1.append("Gender: " + hero.getGender() + "\n");
        jTextArea1.append("Class: " + hero.getHero_class() + "\n");
        jTextArea1.append("Level: " + String.valueOf(hero.getLevel()) + "\n");
        jTextArea1.append("Experience: " + String.valueOf(hero.getExperience()) + "\n");
        jTextArea1.append("Attack: " + hero.getAttack() + "\n");
        jTextArea1.append("Defence: " + hero.getDefence() + "\n");
    }
}
