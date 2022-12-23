package database;

import javax.swing.*;

import java.sql.*;

public class DbConnection {

    public Connection connection;

    Statement statement;

    ResultSet resultSet;

    int value;

    public DbConnection() {

        try {

            //String username = "root";
             String username = "freshmart1";

            //String password = "@oli#himrajhimal#2025@";
            String password = "Freshmart1";

            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(

                    "jdbc:mysql://db4free.net:3306/freshmart1", username, password);

            if (connection != null) {

                System.out.println("Connected to database --> final_projectdb");

            } else {

                System.out.println("Error connecting to database");

            }

            statement = connection.createStatement();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    // Via the use of sql query

    // insert, update and delete

    public int manipulate(String query) {

        try {

            value = statement.executeUpdate(query);

            connection.close();

        } catch (SQLIntegrityConstraintViolationException ex) {

            JOptionPane.showMessageDialog(null, "These details already exist!");

        } catch (SQLException e) {

            e.printStackTrace();

        }

        return value;

    }

    public ResultSet retrieve(String query) {

        try {

            resultSet = statement.executeQuery(query);

        } catch (SQLException e) {

            e.printStackTrace();

        }

        return resultSet;

    }

    public static void main(String[] args) {

        new DbConnection();

    }

}