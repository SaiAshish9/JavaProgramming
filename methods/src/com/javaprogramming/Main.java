package com.javaprogramming;

// method overloading
public class Main {

    public static void main(String[] args) {
	// write your code here
       int score=calculateScore(100);
       System.out.println(score);
    }

    public static int calculateScore(String playerName,int score){
        return score*1000;
    }

    public static int calculateScore(int score){
        return score*1000;
    }
}
