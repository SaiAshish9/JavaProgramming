package com.javaprogramming;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
	Customer customer=new Customer("Tim",54.96);
    Customer anotherCustomer;
    anotherCustomer=customer;
    anotherCustomer.setBalance(12.10);
    System.out.println(anotherCustomer
    .getBalance());
    ArrayList<Integer> intList=new ArrayList<Integer>();
    intList.add(1);
    intList.add(2);
    for(int i=0;i<intList.size();i++){
        System.out.println(intList.get(i) + " "+ intList.get(i).intValue());
    }
    intList.add(1,2);
    for(int i=0;i<intList.size();i++){
            System.out.println(intList.get(i));
    }
    }
}
