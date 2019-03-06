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
public class rentOut {
    private int bill_Number;
    private String date;
    private int numberOfItems;
    private double totalDeposite;
    private double dailyRent;
    private int trancerid;

    public rentOut(int bill_Number, String date, int numberOfItems, double totalDeposite, double dailyRent, int trancerid) {
        this.bill_Number = bill_Number;
        this.date = date;
        this.numberOfItems = numberOfItems;
        this.totalDeposite = totalDeposite;
        this.dailyRent = dailyRent;
        this.trancerid = trancerid;
    }

    public int getBill_Number() {
        return bill_Number;
    }

    public void setBill_Number(int bill_Number) {
        this.bill_Number = bill_Number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public double getTotalDeposite() {
        return totalDeposite;
    }

    public void setTotalDeposite(double totalDeposite) {
        this.totalDeposite = totalDeposite;
    }

    public double getDailyRent() {
        return dailyRent;
    }

    public void setDailyRent(double dailyRent) {
        this.dailyRent = dailyRent;
    }

    public int getTrancerid() {
        return trancerid;
    }

    public void setTrancerid(int trancerid) {
        this.trancerid = trancerid;
    }
    
    
}
