package com.company;
import java.util.*;
import java.util.ArrayList;

class Address{
    private int flatNo;
    private String bldg;
    private String street;
    private String city;
    private int pincode;

    public void setFlatNo(int flatNo){
        this.flatNo=flatNo;
    }
    public int getFlatNo(){
        return flatNo;
    }
    public void setBuildingName(String bldg ){
        this.bldg=bldg;
    }
    public String getBuildingName(){
        return bldg;
    }
    public void setStreetName(String street){
        this.street=street;
    }
    public String getStreetName(){
        return street;
    }
    public void setCity(String city){
        this.city=city;
    }
    public String getCity(){
        return city;
    }
    public void setPincode(int pincode)
    {
        this.pincode=pincode;
    }
    public int getPincode(){
        return pincode;
    }



}
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

class Customer {
    private String name;
    private int phoneNo;
    private String address;
    Scanner sc = new Scanner(System.in);
    public Customer(String address,String name,int phoneNo) {
        setName(name);
        setPhoneNo(phoneNo);
        setAddress(address);
    }
    public void setName(String name) {
        System.out.println("Enter your name: ");
        name = sc.next();
    }
    public String getName() {
        return name;
    }

    public void setPhoneNo(int phoneNo) {
        System.out.println("Enter your Mobile Number: ");
        phoneNo = sc.nextInt();
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setAddress(String address) {
        System.out.println("Enter your address: ");
        name = sc.next();
    }

    public String getAddress() {

        return address;
    }

}

class Main{
    public static void main(String[] args){
        System.out.println("Welcome To Daily Fresh");
        System.out.println("Please enter your details:");
        Customer c1 = new Customer();
        System.out.println(c1.getName());
        System.out.println(c1.getPhoneNo());
        System.out.println(c1.getAddress());



        System.out.println("Hello," +c1.getName() + "what would you like to buy today?");

        ArrayList<Product> list = new ArrayList<Product>();
        Product p1 = new Product("Milk" ,1,80 );
        Product p2 = new Product("cheese", 3,30);
        Product p3 = new Product("Bread ", 2, 25);
        Product p4 = new Product("Juice",6,20);
        Product p5 = new Product("Butter", 8, 50);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        for(int i=0; i < list.size();i++) {
            System.out.println(list.get(i)+"");
        }

    }

}