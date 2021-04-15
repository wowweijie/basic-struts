package org.apache.struts.register.model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Models a Person who registers.
 * @author wongweijie
 *
 */
public class Account {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString() {
        return getUsername();
    }

    public boolean validate(){

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

            statement.setString(1, this.username);
            statement.setString(2, this.password);

            // Execute query, get result of query
            ResultSet results = statement.executeQuery();

            ret = results.next();


        } catch(Exception e) {e.printStackTrace();}

        return ret;
    }
}