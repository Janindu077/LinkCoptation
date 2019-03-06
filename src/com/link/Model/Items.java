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
public class Items {
    private int item_code;
    private String itemName;
    private double depositePrice;
    private double dailyRent;
    private String category;
    private int qtyOnHand;

    public Items(int item_code, String itemName, double depositePrice, double dailyRent, String category, int qtyOnHand) {
        this.item_code = item_code;
        this.itemName = itemName;
        this.depositePrice = depositePrice;
        this.dailyRent = dailyRent;
        this.category = category;
        this.qtyOnHand = qtyOnHand;
    }

    public int getItem_code() {
        return item_code;
    }

    public void setItem_code(int item_code) {
        this.item_code = item_code;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getDepositePrice() {
        return depositePrice;
    }

    public void setDepositePrice(double depositePrice) {
        this.depositePrice = depositePrice;
    }

    public double getDailyRent() {
        return dailyRent;
    }

    public void setDailyRent(double dailyRent) {
        this.dailyRent = dailyRent;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQtyOnHand() {
        return qtyOnHand;
    }

    public void setQtyOnHand(int qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }
    
    
}
