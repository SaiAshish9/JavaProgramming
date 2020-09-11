package com.javaprogramming;

public class Main1 {
    public static void main(String[] args) {
        new Thread(new CodeToRun()).start();
    }
}

class CodeToRun implements Runnable {
    @Override
    public void run() {
        System.out.println("Printing from the runnable");
    }
}

// Lambda expressions provides an easier
// way to work with interfaces and are available since java 8
