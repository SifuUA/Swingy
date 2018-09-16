package com.okres.swingy.util;

import lombok.Cleanup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

   //private static final String SQCONN = "jdbc:sqlite:resources:game.sqlite";
   private static final String SQCONN = "jdbc:sqlite:C:/Users/Geek Machine/IdeaProjects/Swingy/game.sqlite";
  // private static final String SQCONN = "jdbc:sqlite:src/main/resources/db/game.sqlite";

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("org.sqlite.JDBC");
            return DriverManager.getConnection(SQCONN);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
