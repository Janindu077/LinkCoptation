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
public class ItemsDto {
    private String itemCode;
    private String Name;
    private String description;
    private double depositePricee;
    private double dailyRent;
    private int qty;
    private String category;

    public ItemsDto(String itemCode, String Name, String description, double depositePricee, double dailyRent, int qty, String category) {
        this.itemCode = itemCode;
        this.Name = Name;
        this.description = description;
        this.depositePricee = depositePricee;
        this.dailyRent = dailyRent;
        this.qty = qty;
        this.category = category;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getDepositePricee() {
        return depositePricee;
    }

    public void setDepositePricee(double depositePricee) {
        this.depositePricee = depositePricee;
    }

    public double getDailyRent() {
        return dailyRent;
    }

    public void setDailyRent(double dailyRent) {
        this.dailyRent = dailyRent;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    
}
