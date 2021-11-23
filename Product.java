package com.company;

class Product {
    private String productName;
    private String prodQty;
    private double prodMrp;

    Product(String productName,String prodQty,double prodMrp){
        this.productName = productName;
        this.prodQty=prodQty;
        this.prodMrp=prodMrp;
    }

    public void setProductName(String productName) {

        this.productName = productName;
    }

    public String getProductName() {

        return productName;
    }

    public void setProdMrp(double prodMrp) {

        this.prodMrp = prodMrp;
    }

    public double getProdMrp() {

        return prodMrp;
    }

    public void setProdQty(String prodQty) {

        this.prodQty = prodQty;
    }
    public String getProdQty() {

        return prodQty;
    }

    public String toString() {

        return "[" + productName + ", " + prodQty + ", " + prodMrp + "]";
    }


}