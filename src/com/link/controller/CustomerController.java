/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.link.controller;

import com.link.DBConnection.DBConnection;
import com.link.Model.Customer;
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
public class CustomerController {
    public static boolean addCustomer(Customer c1) throws ClassNotFoundException, SQLException{
        Connection con=DBConnection.getDBConnection().getConnecion();
        String sql="insert into customer values(?,?,?,?,?,?,?,?)";
        PreparedStatement stm=con.prepareStatement(sql);
        stm.setObject(1, c1.getCustId());
        stm.setObject(2, c1.getNic());
        stm.setObject(3, c1.getName());
        stm.setObject(4, c1.getAddress());
        stm.setObject(5, c1.getSiteAddress());
        stm.setObject(6, c1.getGender());
        stm.setObject(7, c1.getContactNumber());
        stm.setObject(8, c1.getDate());
        int res=stm.executeUpdate();
        return res>0;   
    }
    public static boolean deleteCustomer (String  id) throws ClassNotFoundException,SQLException{
        Connection conn=DBConnection.getDBConnection().getConnecion();
        String Sql="Delete from customer where cust_id = "+id+";";
        Statement stm=conn.createStatement();
        int res=stm.executeUpdate(Sql);
            return res>0;
    }
    public static boolean updateDetails(Customer c1) throws ClassNotFoundException, SQLException{
        Connection conn=DBConnection.getDBConnection().getConnecion();
        String sql="update customer set name='"+c1.getName()+"',nic ='"+c1.getNic()+"', address ='"+c1.getSiteAddress()+"' ,Contact_No='"+c1.getContactNumber()+"' ,site_Address='"+c1.getSiteAddress()+"', gender ='"+c1.getGender()+"' ,Reg_date='"+c1.getDate()+"' where cust_id='"+c1.getCustId()+"'";
        Statement stm= conn.createStatement();
        int res=stm.executeUpdate(sql);
        
        return res>0;
    }
    public static ArrayList<Customer>getAllItem() throws ClassNotFoundException, SQLException{
       String SQL="Select * From Customer";
       Connection con=DBConnection.getDBConnection().getConnecion();
       Statement sta=con.createStatement();
       ResultSet res=sta.executeQuery(SQL);
       ArrayList<Customer>CustomerList=new ArrayList<>();
       while(res.next()){
           Customer c1=new Customer(res.getInt(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6), res.getString(7),res.getString(8));
            CustomerList.add(c1);
       }
       return CustomerList;
       }
    
    public static ResultSet getTable() throws ClassNotFoundException, SQLException{
       String SQL="Select * From Customer";
       Connection con=DBConnection.getDBConnection().getConnecion();
       PreparedStatement stm=con.prepareStatement(SQL);
       ResultSet res=stm.executeQuery();
//       ArrayList<Customer>CustomerList=new ArrayList<>();
//       while(res.next()){
//           Customer c1=new Customer(res.getInt(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6), res.getString(7),res.getString(8));
//            CustomerList.add(c1);
//       }
       return res;
       }
   public static Customer getAllDetailsCustomer(String cust_id) throws ClassNotFoundException, SQLException{
       String SQL="Select * from Customer where cust_id= '"+cust_id+"';";
       Connection conn=DBConnection.getDBConnection().getConnecion();
       Statement stm=conn.createStatement();
       ResultSet res=stm.executeQuery(SQL);
    
       while (res.next()) {
           Customer c1=new Customer(res.getInt(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6), res.getString(7),res.getString(8));
           return c1;
           
       }
       return null;
   }
   
//boolean type return
}
