package com.okres.swingy.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    //private static final String SQCONN = "jdbc:sqlite:resources:game.sqlite";
    //C:\Users\o.kres\IdeaProjects\Swingy\game.sqlite
    private static final String SQCONN = "jdbc:sqlite:C:/Users/o.kres/IdeaProjects/Swingy/src/main/resources/db/game.sqlite";
  /* private static final String SQCONN = "getConnection(jdbc:sqlite::resource:"
            + DbConnection.class.getResource("/db/game.sqlite");*/
    //private static final String SQCONN = "jdbc:sqlite:src/main/resources/game.sqlite";
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
