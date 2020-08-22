package com.javaprogramming;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MapsTest {
    public static void main(String[] args){
        Set<Integer> test=new HashSet<>();
        test.add(1);
        test.add(2);
        test.add(3);
        for(int i=0;i<test.size();i++){
            System.out.println(test);
        }
        for(int i:test){
            System.out.println(i);
        }

        Set<Integer> test1=new HashSet<>();
        test1.add(2);
        System.out.println(test.removeAll(test1));
        System.out.println(test);
        System.out.println(test.addAll(test1));
        System.out.println(test);
        System.out.println("abc".hashCode());
        test.add(0);
        System.out.println(test);
         test.add(5);
         test.add(4);

        HashSet x=new HashSet<Integer>(test);
        System.out.println(x);
        TreeSet sorted=new TreeSet<Integer>(test);
        System.out.println(sorted);

    }
}
