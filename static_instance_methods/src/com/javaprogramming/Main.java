package com.javaprogramming;

// static methods cannot access instance methods,variables (this)


class Calculator{
//    private static int a;
    private int a;

    public static void printSum(int a,int b){
     System.out.println(a+b);
    }

    public  Calculator(int a){
//         Calculator.a= a;
    this.a=a;
    }


    public void printA(){
        System.out.println(a);
    }

//    static variable
//    public static int getA() {

    public int getA() {
        return a;
    }
}

// instance method
class Dog {
    public void bark(){
        System.out.println("woof");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Calculator.printSum(5, 10);
        printHello();
        dog.bark();

        Calculator c = new Calculator(2);
        Calculator d = new Calculator(3);
        c.printA();
        d.printA();
    }

    public static void printHello() {
        System.out.println("Hello");
    }




}
