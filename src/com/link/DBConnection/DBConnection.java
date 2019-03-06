/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.link.DBConnection;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Janindu
 */
public class DBConnection {

    
    private Connection connection;
    private static DBConnection dbconnection;
    
    private DBConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
         connection = (Connection) DriverManager.getConnection("jdbc:Mysql://localhost/link_construction","root","ijse");
        
    }
    public Connection getConnecion(){
        return connection;
    }
    public static DBConnection getDBConnection() throws ClassNotFoundException, SQLException{
        if (dbconnection==null) {
            dbconnection=new DBConnection();
        
        }
        return dbconnection;
    }
}
