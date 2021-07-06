/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Nocty
 */
public class Model {
    protected static Connection MySQLConfig;
    public static Connection configDB() throws SQLException {
        try {
            String url = "jdbc:mysql://localhost/satudata_db",
                username = "root",
                password = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MySQLConfig = DriverManager.getConnection(url, username, password);
        }catch(SQLException e) {
            e.printStackTrace();
        }
        
        return MySQLConfig;
    }
}
