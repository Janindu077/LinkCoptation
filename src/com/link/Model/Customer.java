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
public class Customer {
    private int CustId;
    private String Nic;
    private String name;
    private String address;
    private String siteAddress;
    private String gender;
    private String contactNumber;
    private String date;

    public Customer(int CustId, String Nic, String name, String address, String siteAddress, String gender, String contactNumber, String date) {
        this.CustId = CustId;
        this.Nic = Nic;
        this.name = name;
        this.address = address;
        this.siteAddress = siteAddress;
        this.gender = gender;
        this.contactNumber = contactNumber;
        this.date = date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    

    public int getCustId() {
        return CustId;
    }

    public void setCustId(int CustId) {
        this.CustId = CustId;
    }

    public String getNic() {
        return Nic;
    }

    public void setNic(String Nic) {
        this.Nic = Nic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSiteAddress() {
        return siteAddress;
    }

    public void setSiteAddress(String siteAddress) {
        this.siteAddress = siteAddress;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
}
