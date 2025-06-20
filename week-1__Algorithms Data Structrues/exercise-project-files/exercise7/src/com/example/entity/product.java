package com.example.entity;

public class product {
    private String productName;
    private double initialPrice;
    private int growthRate;
    private int noyears;

    public product(String productName, double initialPrice, int growthRate, int noyears) {
        this.productName = productName;
        this.initialPrice = initialPrice;
        this.growthRate = growthRate;
        this.noyears = noyears;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getInitialPrice() {
        return initialPrice;
    }

    public void setInitialPrice(double initialPrice) {
        this.initialPrice = initialPrice;
    }

    public int getGrowthRate() {
        return growthRate;
    }

    public void setGrowthRate(int growthRate) {
        this.growthRate = growthRate;
    }

    public int getNoyears() {
        return noyears;
    }

    public void setNoyears(int noyears) {
        this.noyears = noyears;
    }

}
