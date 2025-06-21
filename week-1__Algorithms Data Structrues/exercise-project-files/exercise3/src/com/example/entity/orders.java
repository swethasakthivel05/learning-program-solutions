package com.example.entity;

public class orders {
    private int orderId;
    private String customerName;
    private double totPrice;

    public orders(int orderId, String customerName, double totPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totPrice = totPrice;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getTotPrice() {
        return totPrice;
    }

    public void setTotPrice(double totPrice) {
        this.totPrice = totPrice;
    }

}
