package com.javaprogramming;

//A Functional Interface is an Interface which allows only
//one Abstract method within the Interface scope. There are some predefined functional interface in Java like Predicate, consumer, supplier etc. The return type of a Lambda function (introduced in JDK 1.8) is a also functional interface.
//The Functional Interface PREDICATE is defined
// in the java.util.Function package. It improves manageability of code, helps in unit-testing them separately

//FUNCTIONAL INTERFACES: PREDICATE,
// CONSUMER, FUNCTION, AND SUPPLIER

// predicate accepts one argument and returns true/false
// Function accepts one argument and returns some value
// Consumer accepts one argument and returns no result
// Supplier takes no argument and returns some value

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Predicate1 {

    public static void main(String[] args) {
        Predicate<Integer> lesserThan= i-> i<18 ;
        Predicate<Integer> greaterThan=i-> i>10;
        Function<Integer,Integer> fn=t->t*2;
        Supplier<Integer> fn1=()->20;
        Integer x= new Integer(10);
        Consumer<Integer> fn2=p->p=10;
        fn2.accept(x);
        System.out.println(x);
        System.out.println(fn.apply(10));
        System.out.println(fn1.get());
        System.out.println(lesserThan.and(greaterThan).test(11));

    }
}
