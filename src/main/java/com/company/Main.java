package com.company;

import com.mysql.jdbc.Driver;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        connectDriver();

        Connection connection;

        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema?useUnicode=true&serverTimezone=UTC&useSSL=true&verifyServerCertificate=false", "root", "1475963");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            throw new RuntimeException("Registration fault");
        }

        printBrend(connection);
        try {
            String name_brend = "Versage";
            PreparedStatement statement = connection.prepareStatement("INSERT INTO new_schema.brend (name) VALUES (?)");
            statement.setString(1, name_brend);
            statement.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            throw new RuntimeException("Create error");
        }
        printBrend(connection);

    }

    public static void connectDriver (){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Driver not found");
        }
    }


    public static void printBrend (Connection connection){
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM new_schema.brend");
            while (resultSet.next()){
                int id_brend = resultSet.getInt("id");
                String name_brend = resultSet.getString("name");
                System.out.println("id_brend: " + id_brend + " " + "id_name:" + name_brend);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            throw new RuntimeException("Create error");
        }
    }
}
