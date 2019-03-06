/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.link.Model;

/**
 *
 * @author Janindu
 */
public class passwordDTO {
    private String userName;
    private String password;
    private int userId;
    private String accType;

    public passwordDTO(int userId,String userName, String password,  String accType) {
        this.userName = userName;
        this.password = password;
        this.userId = userId;
        this.accType = accType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }
    

}
