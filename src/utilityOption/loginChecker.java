/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilityOption;

import com.link.DBConnection.DBConnection;
import com.link.Model.passwordDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Janindu
 */
public class loginChecker {
    public static boolean addUser(passwordDTO p) throws ClassNotFoundException, SQLException{
        Connection con=DBConnection.getDBConnection().getConnecion();
        String sql="insert into password values(?,?,?,?)";
        PreparedStatement stm =con.prepareCall(sql);
        stm.setObject(1, p.getUserId());
        stm.setObject(2, p.getUserName());
        stm.setObject(3, p.getPassword());
        stm.setObject(4, p.getAccType());
        
        int res=stm.executeUpdate();
        if (res>0) {
            return true;
        }
        
        return false;
    }
    public static boolean deleteUser(String userName) throws ClassNotFoundException, SQLException{
        
        Connection con=DBConnection.getDBConnection().getConnecion();
        String sql="delete password where user_Name="+userName+";";
        Statement stm=con.createStatement();
        int res=stm.executeUpdate(sql);
        if (res>0) {
            return true;
        }
        
        return false;
    }
    public static boolean updateDetails(passwordDTO p) throws SQLException, ClassNotFoundException{
        Connection conn=DBConnection.getDBConnection().getConnecion();
        String Sql="update password set user_Name='"+p.getUserName()+"',password= '"+p.getPassword()+"',acc_type='"+p.getAccType()+"' where user_Name='"+p.getUserId();
       Statement stm=conn.createStatement();
       int res=stm.executeUpdate(Sql);
        if (res>0) {
            return true;
        }
        return false;
    }
    public static ArrayList<passwordDTO> getAllItems() throws SQLException, ClassNotFoundException{
         String SQL="Select * From Customer";
       Connection con=DBConnection.getDBConnection().getConnecion();
       Statement sta=con.createStatement();
       ResultSet res=sta.executeQuery(SQL);
       ArrayList<passwordDTO>userList=new ArrayList<>();
       while(res.next()){
           passwordDTO u1=new passwordDTO(res.getInt(1), res.getString(2), res.getString(3), res.getString(4));
            userList.add(u1);
       }
       return userList;
    }
            
           
    
}
