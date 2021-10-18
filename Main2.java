package com.company;
import java.util.*;
import java.util.ArrayList;
import java.io.*;
public class Main2{
    static double totalCost,orderqty;
    static Order order;
    static Product product;

    String item;

    public static void main(String[] args)throws IOException{
        System.out.println("Welcome To Daily Fresh");
        System.out.println("Please enter your details:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Name:");
        String name = br.readLine();
        System.out.println("PhoneNo:");
        String phoneNo = br.readLine();
        System.out.println("Address:");
        System.out.println("Area:");
        String area = br.readLine();
        System.out.println("City:");
        String city = br.readLine();
        System.out.println("Pincode:");
        int pincode = Integer.parseInt(br.readLine());
        Customer c1 = new Customer(name,phoneNo);
        Address a1 = new Address(area,city,pincode);
        System.out.println("Name: "+c1.getName());
        System.out.println("Mobile No:" +c1.getPhoneNo());
        System.out.println("Area:" +a1.getArea());
        System.out.println("City:" +a1.getCity());
        System.out.println("Pincode:" +a1.getPincode());
        order = new Order();
        totalCost=0.0;
        orderqty=0.0;
            System.out.println("Hello," +c1.getName()+ " "+" Here's a list of products and their price");
            System.out.println("1.Milk\n2.Eggs\n3.Cheese\n4.Butter\n5.Bread\n6.Order Complete");
            ArrayList<Product> products = new ArrayList<Product>();
            Product p1 = new Product("Milk" ,"1 ltr",50 );
            products.add(p1);
            Product p2 = new Product("cheese", "100 gm",100);
            products.add(p2);
            Product p3 = new Product("Bread","400 gm",40);
            products.add(p3);
            Product p4 = new Product("Eggs","1 dozen",60);
            products.add(p4);
            Product p5 = new Product("Butter", "100 gm", 50);
            products.add(p5);
            for(int i=0; i < products.size();i++) {
                System.out.println(products.get(i));
            }
            double q=0;
        while(true)
        {
            System.out.println("What would you like to buy ?");
            String item = br.readLine();
            if(item.equalsIgnoreCase("milk"))
            {
                System.out.println("Enter quantity");
                q = Double.parseDouble(br.readLine());
                if (orderqty>= 5.00) {
                    System.out.println("Maximum 5 items allowed per order");
                    break;
                }
                else
                {
                    totalCost=totalCost+order.getTotalCost(p1,q);
                    System.out.println(totalCost);
                    orderqty=orderqty+1;
                }
            }
            else if(item.equalsIgnoreCase("cheese"))
            {System.out.println("Enter quantity");
                q = Double.parseDouble(br.readLine());
                if (orderqty>= 5.00) {
                    System.out.println("Maximum 5 items allowed per order");
                    break;
                }
                else
                {
                    totalCost=totalCost+order.getTotalCost(p2,q);
                    System.out.println(totalCost);
                    orderqty=orderqty+1;
                }
            }
            else if(item.equalsIgnoreCase("bread"))
            {System.out.println("Enter quantity");
                q = Double.parseDouble(br.readLine());
                if (orderqty>= 5.00) {
                    System.out.println("Maximum 5 items allowed per order");
                    break;
                }
                else
                {
                    totalCost=totalCost+order.getTotalCost(p3,q);
                    System.out.println(totalCost);
                    orderqty=orderqty+1;
                }
            }
            else if(item.equalsIgnoreCase("eggs"))
            {System.out.println("Enter quantity");
                q = Double.parseDouble(br.readLine());
                if (orderqty>= 5.00) {
                    System.out.println("Maximum 5 items allowed per order");
                    break;
                }
                else
                {
                    totalCost=totalCost+order.getTotalCost(p4,q);
                    System.out.println(totalCost);
                    orderqty=orderqty+1;
                }
            }
            else if(item.equalsIgnoreCase("butter")) {
                System.out.println("Enter quantity");
                q = Double.parseDouble(br.readLine());
                if (orderqty >= 5.00) {
                    System.out.println("Maximum 5 items allowed per order");
                    break;
                } else {
                    totalCost = totalCost + order.getTotalCost(p5, q);
                    System.out.println(totalCost);
                    orderqty=orderqty+1;
                }
            }
            else if(item.equalsIgnoreCase("order complete"))
            {
                break;
            }
            else
            {}
        }
    }










    //System.out.print(cart);
}




    /*public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }*/
