package com.devcolibri.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    private final static String URL =
            "jdbc:mysql://localhost:3306/mydbtest";
    private final static String URLFIXED =
            "jdbc:mysql://localhost:3306/mydbtest";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "Root";

    public static void main(String[] args) throws SQLException {
        Connection connection;
        connection = DriverManager.getConnection(URLFIXED, USERNAME, PASSWORD);

        if (!connection.isClosed()) {
            System.out.println("Соединение с БД Установлено!");
        }
        connection.close();
        if (connection.isClosed()) {
            System.out.println("Соединение с БД Закрыто!");
        }


    }
}
