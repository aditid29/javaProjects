package com.company;
import java.util.*;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        System.out.println("Welcome To Daily Fresh");
        System.out.println("Please enter your details:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String phoneNo = sc.nextLine();
        String address = sc.nextLine();
        Customer c1 = new Customer(address,name,phoneNo);
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
        
        sc.close();

    }

}