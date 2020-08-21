package com.javaprogramming;

import java.util.ArrayList;

public class GroceryList {
    private int[] myNumbers=new int[50];

//    ArrayList is a class
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item){
           groceryList.add(item);
    }

    public void print(){
        System.out.println(groceryList.size());
        for(int i=0;i<groceryList.size();i++){
            System.out.println(groceryList.get(i));
        }
    }

    public void modify(int position,String newItem){
        groceryList.set(position,newItem);
        System.out.println("modified");
    }

    public void remove(int position){
        String item=groceryList.get(position);
        groceryList.remove(position);
        System.out.println("removed");
    }

    public String findItem(String searchItem){
        boolean exists=groceryList.contains(searchItem);
        int position=groceryList.indexOf(searchItem);
        if(position>=0){
            return groceryList.get(position);
        }
        return  null;
    }

}
