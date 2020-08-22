package com.javaprogramming;

public class dog extends abstractClass{
    public dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println( getName()+ "eating");
    }

//    Collections API is an excellent example, in which list is an interface and arrayList , linkedList are implementations
//    JDBC API .It exist of almost only interfaces.The concrete implementations are provided as " JDBC drivers"

//    purpose of abstract class is to provide a common definition of a base class that multiple derived classes can share
//    interface is just a declaration of methods of an class and not implementation
//    all methods in interface are automatically abstract and public
//    a class can extend only one abstract class while it can implement several interfaces
//    abstract classes permits us to make functionality that subclasses can implement or override them whereas interfaces only permits to state functionality and not implement them

//    difference between abstraction and interface
//    in interface all methods need to be abstracted
//    we cannot instantiate them -> similarity
//    we can share code using abstract class

    @Override
    public void breathe() {
        System.out.println("Breathing");
    }

}
