package com.okres.swingy.model;

import com.okres.swingy.util.DbConnection;

import java.sql.Connection;
import java.sql.SQLException;

public class LoginModel {

    Connection connection;

    public LoginModel() {
        try {
            this.connection = DbConnection.getConnection();
        }catch (SQLException e) {
            e.printStackTrace();
        }
        if (this.connection == null) {
            System.exit(1);
        }
    }

    public boolean isDatabaseConnected() {
        return this.connection != null;
    }
}
