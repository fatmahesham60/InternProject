package org.example;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.*;
public class App
{

    final String url=" jdbc:mariadb://localhost:3307";
    final String user="root";
    final String password="12345";

    Scanner sc = new Scanner(System.in);


    {
        try {
            final Connection connection = DriverManager.getConnection(url, user,password);
            final Statement statement = connection.createStatement();;
            Scanner scanner = new Scanner(System.in)) {
            String createTableSQL = """
                CREATE TABLE  admin (
                    id INT PRIMARY KEY,
                    name VARCHAR(50) NOT NULL,
                    email VARCHAR(100) UNIQUE NOT NULL,
                    password VARCHAR(50) NOT NULL
                )
            """;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main( String[] args )
    {



    }
}
