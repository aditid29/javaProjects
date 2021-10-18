package com.company;
import java.util.*;
import java.util.ArrayList;

public class Main{
    double totalCost;
    Order order;
    Product product;
    double q;
    String item;

    public static void main(String[] args){
        System.out.println("Welcome To Daily Fresh");
        System.out.println("Please enter your details:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Name:");
        String name = sc.nextLine();
        System.out.println("PhoneNo:");
        String phoneNo = sc.nextLine();
        System.out.println("Address:");
        String address = sc.nextLine();
        Customer c1 = new Customer(address,name,phoneNo);

        System.out.println("Name: "+c1.getName());
        System.out.println("Mobile No:" +c1.getPhoneNo());
        System.out.println("Address:" +c1.getAddress());

        System.out.println("Hello," +c1.getName()+ " "+" Here's a list of products and their price");
        //System.out.println("1.Milk\n2.Eggs\n3.Cheese\n4.Butter\n5.Bread");
        ArrayList<Product> cart = new ArrayList<Product>();
        Product p1 = new Product("Milk" ,"1 ltr",50 );
        cart.add(p1);
        Product p2 = new Product("cheese", "100 gm",100);
        cart.add(p2);
        Product p3 = new Product("Bread","400 gm",40);
        cart.add(p3);
        Product p4 = new Product("Eggs","1 dozen",60);
        cart.add(p4);
        Product p5 = new Product("Butter", "100 gm", 50);
        cart.add(p5);
        for(int i=0; i < cart.size();i++) {
            System.out.println(cart.get(i));
        }
        System.out.println("What would you like to buy ?");
        String item = sc.nextLine();
        System.out.println("Enter quantity");
        double q = sc.nextDouble();



        if (q > 5){
            System.out.println("Maximum 5 items allowed per order");
        }
        else {
        switch (item) {
            case "Milk":
                item.getTotalCost();




        }
        }
        









        //System.out.print(cart);

        sc.close();

    }

    public double getTotalCost(double q, double prodMrp) {
        return q*prodMrp;
    }


    /*public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }*/
}