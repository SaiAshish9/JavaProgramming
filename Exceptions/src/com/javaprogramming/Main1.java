package com.javaprogramming;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
	// write your code here
        System.out.println(divide(3,0));
        int x=getInput();
        System.out.println(x);
    }

    private static int divide(int x,int y){
        try{
            return x/y;
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
            return 0;
        }
    }

    private static int getInput(){
        Scanner s=new Scanner(System.in);
        try{
            return s.nextInt();
        }catch(InputMismatchException e){
            System.out.println(e);
            return 0;
        }
    }




}
