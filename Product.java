package com.company;

class Product {
    private String productName;
    private int productId;
    private double MRP;

    Product(String productName, int productId, double MRP) {
        this.productName = productName;
        this.productId = productId;
        this.MRP = MRP;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getProductId() {
        return productId;
    }

    public void setMRP(double MRP) {
        this.MRP = MRP;
    }

    public double getMRP() {
        return MRP;
    }
}