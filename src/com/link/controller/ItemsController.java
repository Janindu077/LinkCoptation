/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.link.controller;

import com.link.DBConnection.DBConnection;
import com.link.Model.Items;
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
public class ItemsController {
    public static boolean addItem(Items I1) throws ClassNotFoundException, SQLException{
        Connection conn=DBConnection.getDBConnection().getConnecion();
        String SQL="insert into items value(?,?,?,?,?,?)";
        PreparedStatement stm=conn.prepareStatement(SQL);
        stm.setObject(1, I1.getItem_code());
        stm.setObject(2, I1.getItemName());
        stm.setObject(3, I1.getDepositePrice());
        stm.setObject(4, I1.getDailyRent());
        stm.setObject(5, I1.getCategory());
        stm.setObject(6, I1.getQtyOnHand());
        int res=stm.executeUpdate();
        if (res>0) {
            return true;
        }
        return false;
    }
    public static boolean deleteItems (String  Code) throws ClassNotFoundException, SQLException{
        Connection conn=DBConnection.getDBConnection().getConnecion();
        String Sql="Delete from Items where Item_code ="+Code+";";
        Statement stm=conn.createStatement();
        int res=stm.executeUpdate(Sql);
        if (res>0) {
            return true;
        }
                
            return false;
    }
       
   
    public static boolean updateDetails(Items I1) throws ClassNotFoundException, SQLException{
        Connection conn=DBConnection.getDBConnection().getConnecion();
        String sql="update items set Item_Name ='"+I1.getItemName()+"',Deposit_Price ='"+I1.getDepositePrice()+"',Daily_Rent = '"+I1.getDailyRent()+"',category = '"+I1.getCategory()+"',qty_on_hand = '"+I1.getQtyOnHand()+"' where Item_code = '"+I1.getItem_code()+"'";
        Statement stm= conn.createStatement();
        int res=stm.executeUpdate(sql);
        
        return res>0;
    }
    public static ArrayList<Items>getAllItem() throws ClassNotFoundException, SQLException{
       String SQL="Select * From Items";
       Connection con=DBConnection.getDBConnection().getConnecion();
       Statement sta=con.createStatement();
       ResultSet res=sta.executeQuery(SQL);
       ArrayList<Items>ItemList=new ArrayList<>();
       while(res.next()){
              Items I1=new Items(res.getInt(1),res.getString(2),res.getDouble(3),res.getDouble(4), res.getString(5), res.getInt(6));
            ItemList.add(I1);
       }
       return ItemList;
       }
    public static ResultSet getAllItemToTable() throws ClassNotFoundException, SQLException{
       String SQL="Select * From Items";
       Connection con=DBConnection.getDBConnection().getConnecion();
       Statement sta=con.createStatement();
       ResultSet res=sta.executeQuery(SQL);
//       ArrayList<Items>ItemList=new ArrayList<>();
//       while(res.next()){
//              Items I1=new Items(res.getInt(1),res.getString(2),res.getDouble(3),res.getDouble(4), res.getString(5), res.getInt(6));
//            ItemList.add(I1);
//       }
       return res;
       }
    
    //correct
    
   public static Items getAllDetailsItems(String Item_Code) throws ClassNotFoundException, SQLException{
       String SQL="Select * from Items where Item_code= '"+Item_Code+"';";
       Connection conn=DBConnection.getDBConnection().getConnecion();
       Statement stm=conn.createStatement();
       ResultSet res=stm.executeQuery(SQL);
    
       while (res.next()) {
           Items I1=new Items(res.getInt(1),res.getString(2),res.getDouble(3),res.getDouble(4), res.getString(5), res.getInt(6));
           
           return I1;
           
       }
       return null;
   }

}
