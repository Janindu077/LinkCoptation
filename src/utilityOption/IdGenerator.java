/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilityOption;

import com.link.DBConnection.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Janindu
 */
public class IdGenerator  {
    public static String getUserId() throws ClassNotFoundException, SQLException {
        String SQL="select * from Password order by userId desc limit 1";
        Connection connection=DBConnection.getDBConnection().getConnecion();
        Statement stm=connection.createStatement();
        ResultSet rstRepair=stm.executeQuery(SQL);
        rstRepair.next();
        int isd=rstRepair.getInt("userId")+1;   
        String id=isd+"";
        return id;
    }
    public static String getCustId() throws ClassNotFoundException, SQLException {
        String SQL="select * from customer order by cust_id desc limit 1";
        Connection connection=DBConnection.getDBConnection().getConnecion();
        Statement stm=connection.createStatement();
        ResultSet rstRepair=stm.executeQuery(SQL);
        rstRepair.next();
        int isd=rstRepair.getInt("cust_id")+1;   
        String id=isd+"";
        return id;
    }
    
 public static String getItemCode() throws ClassNotFoundException, SQLException {
        String SQL="select * from Items order by item_code desc limit 1";
        Connection connection=DBConnection.getDBConnection().getConnecion();
        Statement stm=connection.createStatement();
        ResultSet rstRepair=stm.executeQuery(SQL);
        rstRepair.next();
        int isd=rstRepair.getInt("item_Code")+1;   
        String id=isd+"";
        return id;
    }
}
