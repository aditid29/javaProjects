package com.company;

public class Order {


    private int orderNo;
    private double orderQty;
    private double orderPrice;
    Product product;
    double q;

    public double getOrderQty(double q) {
        return orderQty;
    }

    public void setOrderQty(double orderQty) {
        this.orderQty = orderQty;
    }


    public double getOrderPrice() {
        return product.getProdMrp()*orderQty;
    }

    public void setOrderPrice(double orderPrice)
    {
        this.orderPrice = orderPrice ;
    }


    public double getTotalCost() {
        double prodMrp;
        double v = q * prodMrp;

    }

