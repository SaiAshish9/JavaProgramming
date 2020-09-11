package com.javaprogramming;

import java.util.ArrayList;

class IntClass{
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public IntClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class Main {

    public static void main(String[] args) {
	String[] strArray=new String[10];
	int[] intArray=new int[10];

	ArrayList<String> stringArrayList=new ArrayList<>();
	stringArrayList.add("sai");
	ArrayList<IntClass> intClassArrayList=new ArrayList<>();
	intClassArrayList.add(new IntClass(54));
	Integer integer=new Integer(10);
	Double doubleValue=new Double(20.0);

	ArrayList<Integer> intArrayList=new ArrayList<Integer>();
    for(int i=0;i<=10;i++){
        intArrayList.add(Integer.valueOf(i));
//        autoboxing primitive type to object wrapper
    }

    for(int i=0;i<=10;i++){
        System.out.println(i+" -->" + intArrayList.get(i).intValue());
//   from object wrapper to primitive type
    }

    Integer myIntValue=56; //Integer.valueOf(56)
    int myInt=myIntValue.intValue();
        System.out.println(myInt);


        ArrayList<Double> myDoubleValues=new ArrayList<Double>();

        for(double i=0.0;i<10;i++){
            myDoubleValues.add(Double.valueOf(i));
        }

        for (int i=0;i<10;i++){
            System.out.println(myDoubleValues.get(i).doubleValue());
        }
    }
}
