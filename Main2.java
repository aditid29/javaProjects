package com.company;
import java.util.*;
import java.util.ArrayList;
import java.io.*;
public class Main2 {
    static double totalCost, orderqty;
    static Order order;
    static Product product;



    public static void main(String[] args) throws IOException {
        System.out.println("Welcome To Daily Fresh");
        //System.out.println("Please enter your details:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("Name:");
        //String name = br.readLine();
        //System.out.println("PhoneNo:");
        //String phoneNo = br.readLine();
        //System.out.println("Address:");
        //System.out.println("Area:");
        //String area = br.readLine();
        //System.out.println("City:");
       // String city = br.readLine();
        //System.out.println("Pincode:");
        //int pincode = Integer.parseInt(br.readLine());
        Customer c1 = new Customer("Gargi","9004651615");
        Address a1 = new Address("Worli","Mumbai",400016);
        c1.setName("Gargi");
        c1.setPhoneNo("9004651615");
        a1.setArea("Worli");
        a1.setCity("Mumbai");
        a1.setPincode(400016);
        System.out.println("Name: " + c1.getName());
        System.out.println("Mobile No:" + c1.getPhoneNo());
        System.out.println("Area:" + a1.getArea());
        System.out.println("City:" + a1.getCity());
        System.out.println("Pincode:" + a1.getPincode());
        order = new Order();
        totalCost = 0.0;
        orderqty = 0.0;
        System.out.println("Hello," + c1.getName() + " " + " Here's a list of products and their price");
        //System.out.println("1.Milk\n2.Eggs\n3.Cheese\n4.Butter\n5.Bread\n6.Order Complete");
        ArrayList<Product> products = new ArrayList<Product>();
        Product p1 = new Product("milk", "1 ltr", 50);
        products.add(p1);
        Product p2 = new Product("cheese cubes", "1 Cube", 30);
        products.add(p2);
        Product p3 = new Product("bread", "1 Loaf(400gm)", 40);
        products.add(p3);
        Product p4 = new Product("eggs", "1 Dozen", 60);
        products.add(p4);
        Product p5 = new Product("butter", "1 Packet(100 gm)", 50);
        products.add(p5);
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }
        double q = 0;
        ArrayList<Double> bill = new ArrayList<Double>();
        double sum = 0.0;
        while (true) {
            System.out.println("What would you like to buy ?");
            String item = br.readLine();
            switch (item) {
                case "milk":
                    System.out.println("Enter quantity");
                    q = Double.parseDouble(br.readLine());
                    double qty1 = order.getOrderQty(order.setOrderQty(q));
                    if (qty1 <= 5) {
                        double totalCost1 = totalCost + order.getTotalCost(p1, qty1);
                        System.out.println("Price:");
                        System.out.println(totalCost1);
                        orderqty = orderqty + 1;
                        //System.out.println(qty1);
                        //System.out.println(orderqty);
                        bill.add(totalCost1);

                    } else {
                        System.out.println("Maximum 5 items allowed per order");

                    }
                    break;

                case "cheese cubes":
                    System.out.println("Enter quantity");
                    q = Double.parseDouble(br.readLine());
                    double qty2 = order.getOrderQty(order.setOrderQty(q));
                    if (qty2 <= 5) {
                        double totalCost2 = totalCost + order.getTotalCost(p2, qty2);
                        System.out.println("Price:");
                        System.out.println(totalCost2);
                        orderqty = orderqty + 1;
                        //System.out.println(qty2);
                        //System.out.println(orderqty);
                        bill.add(totalCost2);

                    } else {
                        System.out.println("Maximum 5 items allowed per order");

                    }
                    break;

                case "bread":
                    System.out.println("Enter quantity");
                    q = Double.parseDouble(br.readLine());
                    double qty3 = order.getOrderQty(order.setOrderQty(q));
                    if (qty3 <= 5) {
                        double totalCost3 = totalCost + order.getTotalCost(p5, qty3);
                        System.out.println("Price:");
                        System.out.println(totalCost3);
                        orderqty = orderqty + 1;
                        //System.out.println(qty3);
                        //System.out.println(orderqty);
                        bill.add(totalCost3);
                    } else {
                        System.out.println("Maximum 5 items allowed per order");

                    }
                    break;

                case "eggs":
                    System.out.println("Enter quantity");
                    q = Double.parseDouble(br.readLine());
                    double qty4 = order.getOrderQty(order.setOrderQty(q));
                    if (qty4 <= 5) {
                        double totalCost4 = totalCost + order.getTotalCost(p4, qty4);
                        System.out.println("Price:");
                        System.out.println(totalCost4);
                        orderqty = orderqty + 1;
                        //System.out.println(qty4);
                        //System.out.println(orderqty);
                        bill.add(totalCost4);
                    } else {
                        System.out.println("Maximum 5 items allowed per order");

                    }
                    break;

                case "butter":
                    System.out.println("Enter quantity");
                    q = Double.parseDouble(br.readLine());
                    double qty5 = order.getOrderQty(order.setOrderQty(q));
                    if (qty5 <= 5) {
                        double totalCost5 = totalCost + order.getTotalCost(p3, qty5);
                        System.out.println("Price:");
                        System.out.println(totalCost5);
                        orderqty = orderqty + 1;
                        //System.out.println(qty5);
                        //System.out.println(orderqty);
                        bill.add(totalCost5);
                    } else {
                        System.out.println("Maximum 5 items allowed per order");

                    }
                    break;
                case "order complete":
                    for (int i = 0; i < bill.size(); i++) {
                        sum += bill.get(i);
                    }
                    System.out.println("Your order amount is: " + sum);
                    return;
            }

        }


    }
}
