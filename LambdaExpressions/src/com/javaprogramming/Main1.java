package com.javaprogramming;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main1 {

    interface  UpperConcat{
        public String upperAndConcat(String s1,String s2);
    }

    interface Func{
        int operation(int a ,int b);
    }

    private int operate(int a, int b, Func fobj)
    {
        return fobj.operation(a, b);
    }





    public static void main(String[] args) {
        Func add = (int x, int y) -> x + y;

        new Thread(() -> System.out.println("runnable")).start();
        new Thread(() ->{
            System.out.println("1");
            System.out.println("2");
        }).start();

        List<String> list=new ArrayList<>();
        list.add("sai");
        list.add("ashish");
        Main1 x=new Main1();

        System.out.println(x.operate(1,2,add));

        Collections.sort(list,(a,b)-> a.compareTo(b));

        UpperConcat s3=(String s1,String s2) -> s1.toUpperCase()+s2.toUpperCase();

        System.out.println(s3.upperAndConcat("sai","ashish"));

        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.forEach(x1 -> System.out.println(x1));

        for(String a:list){
            System.out.println(a);
        }

    }
}

//new Thread(new Code()).start();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("runnable");
//            }
//        }).start();

//class Code implements Runnable {
//    @Override
//    public void run() {
//        System.out.println("Printing from the runnable");
//    }
//}

// Lambda expressions provides an easier
// way to work with interfaces and are available since java 8
