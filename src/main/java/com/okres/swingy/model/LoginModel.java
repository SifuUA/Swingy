package com.okres.swingy.model;

import com.okres.swingy.util.DbConnection;

import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
                    resultSet.getString(5),
                    Integer.parseInt(resultSet.getString(2)),
                    resultSet.getString(3),
                    resultSet.getString(4));
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

        jTextArea1.append(hero.getName());
        jTextArea1.append("\n");
        jTextArea1.append(String.valueOf(hero.getAge()));
        jTextArea1.append("\n");
        jTextArea1.append(hero.getGender());
        jTextArea1.append("\n");
        jTextArea1.append(hero.getHero_class());
    }
}
