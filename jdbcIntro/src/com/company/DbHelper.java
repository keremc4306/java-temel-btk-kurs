package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
    private String userName = "root";
    private String password = "KCmerkez97.,";
    private String dbUrl = "jdbc:mysql://localhost:3306/world";

    //Create db connection
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl, userName, password);
    }

    // Exception handling related to db
    public void showErrorMessage(SQLException exception) {
        System.out.println("Error: " + exception.getMessage()); //exception.getMessage() returns error from coming db
        System.out.println("Error code: " + exception.getErrorCode());
    }
}
