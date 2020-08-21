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

    private void modify(int position,String newItem){
        groceryList.set(position,newItem);
        System.out.println("modified");
    }

    private void remove(int position){
        groceryList.remove(position);
        System.out.println("removed");
    }

    private int findItem(String searchItem){
        return groceryList.indexOf(searchItem);
//        boolean exists=groceryList.contains(searchItem);
//        int position=groceryList.indexOf(searchItem);
//        if(position>=0){
//            return groceryList.get(position);
//        }
//        return  null;
    }

    public void remove(String newItem){
        int position=findItem(newItem);
        if(position>=0){
            remove(position);
        }
    }

    public void modify(String newItem){
           int position=findItem(newItem);
           if(position>=0){
               modify(position,newItem);
           }
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }



    public boolean onFile(String item){
        int positon=findItem(item);
        if(positon>=0){
            return true;
        }
        return  false;
    }

}
