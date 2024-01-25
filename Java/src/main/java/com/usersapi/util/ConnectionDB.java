package com.usersapi.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Romel
 */
public class ConnectionDB {

    private static final String URL = "";
    private static final String USER = "";
    private static final String PASSWORD = "";

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new SQLException("MySQL JDBC Driver not found.", e);
        }
    }

    public static void closeConnection(Connection con) {
        if (con != null) {
            try {
                if (!con.isClosed()) {
                    con.close();
                    System.out.println("Close connection.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
                System.err.println("Close connection error.");
            }
        }
    }
}
