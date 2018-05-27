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


    public void readFile() throws SQLException {
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
                if (line.equals(""))
                    continue;
                /*new Hero(line.split(",")[1].trim(),
                        Integer.parseInt(line.split(",")[2].trim()),
                        line.split(",")[3].trim(),
                        line.split(",")[4].trim(),
                        Integer.parseInt(line.split(",")[5].trim()),
                        Integer.parseInt(line.split(",")[6].trim()),
                        line.split(",")[7].trim(),
                        line.split(",")[8].trim());*/
                preparedStatement.setString(1,
                        line.split(",")[0].trim());
                preparedStatement.setInt(2,
                        Integer.parseInt(line.split(",")[1].trim()));
                preparedStatement.setString(3,
                        line.split(",")[2].trim());
                preparedStatement.setString(4,
                        line.split(",")[3].trim());
                preparedStatement.setInt(5,
                        Integer.parseInt(line.split(",")[4].trim()));
                preparedStatement.setInt(6,
                        Integer.parseInt(line.split(",")[5].trim()));
                preparedStatement.setString(7,
                        line.split(",")[6].trim());
                preparedStatement.setString(8,
                        line.split(",")[7].trim());
                preparedStatement.execute();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            connection.close();
        }
    }
}
