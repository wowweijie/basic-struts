package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Accounts {

    public static boolean validate(String username, String password){

        boolean ret = false;

        try {
            // Load the mySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Attempt to connect to database
            Connection connect = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/usersdb", "root", "root");

            // Setup mySQL authentication query
            PreparedStatement statement = connect.prepareStatement(
                    "SELECT * FROM usersdb.login WHERE username = ? AND password = ?");

            statement.setString(1, username);
            statement.setString(2, password);

            // Execute query, get result of query
            ResultSet results = statement.executeQuery();

            ret = results.next();


        } catch(Exception e) {e.printStackTrace();}

        return ret;
    }

}
