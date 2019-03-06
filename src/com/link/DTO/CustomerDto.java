/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.link.DTO;

/**
 *
 * @author Janindu
 */
public class CustomerDto {
    private String customerID;
    private String nic;
    private String Name;
    private String Address;
    private String SiteAddress;
    private String contact;
    private String gender;

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getSiteAddress() {
        return SiteAddress;
    }

    public void setSiteAddress(String SiteAddress) {
        this.SiteAddress = SiteAddress;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public CustomerDto(String customerID, String nic, String Name, String Address, String SiteAddress, String contact, String gender) {
        this.customerID = customerID;
        this.nic = nic;
        this.Name = Name;
        this.Address = Address;
        this.SiteAddress = SiteAddress;
        this.contact = contact;
        this.gender = gender;
    }
    
    
}
