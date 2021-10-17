package com.company;
import java.util.*;
import java.util.ArrayList;

public class Main{
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
        System.out.println(c1.getName());
        System.out.println(c1.getPhoneNo());
        System.out.println(c1.getAddress());

        System.out.println("Hello," +c1.getName()+ " "+"what would you like to buy today?");
        System.out.println("1.Milk\n2.Eggs\n3.Cheese\n4.Butter\n5.Bread");
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








        /*for(int i=0; i < cart.size();i++) {
            System.out.println(cart.get(i));
        }*/
        System.out.print(cart);

        sc.close();

    }

}