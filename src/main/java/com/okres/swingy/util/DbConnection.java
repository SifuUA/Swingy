package com.okres.swingy.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    /*private static final String USERNAME = "root";
    private static final String PASSWORD = "root";*/
    private static final String SQCONN = "jdbc:sqlite:heroes.sqlite";

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
