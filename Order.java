package com.company;
import java.io.*;
public class Order {


    protected  double orderQty;
    protected  double orderPrice;
    Product product;
    protected double q;

    public double getOrderQty(double q) {
        return orderQty;
    }

    public double setOrderQty(double orderQty) {
        this.orderQty = orderQty;
        return orderQty;
    }


    public double getOrderPrice() {
        return product.getProdMrp() * orderQty;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }


    public double getTotalCost(Product pm, double q)throws IOException {
        double v = q * pm.getProdMrp();
return v;
    }
}