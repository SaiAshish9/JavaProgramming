package com.javaprogramming;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        int result=divide();
        System.out.println(result);
    }

    private static int divide(){
        int x;
        try{
            x=getInt();
            int y=getInt();
            System.out.println(x +" "+y);
            return x/y;
        }catch ( ArithmeticException | NoSuchElementException e){
//            x=getInt();
        throw new ArithmeticException("no suitable input");
        }finally {
            System.out.println("finally block");
        }

    }
//ctrl d closes input stream

    private static int getInt(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter");
        while (true){
            try{
                return s.nextInt();
            }catch (InputMismatchException e){
                s.nextLine();
                System.out.println("Enter correct no.");
            }
        }
    }

}

//    *Stack Trace*
//    Exception in thread "main" java.util.InputMismatchException
//        at java.base/java.util.Scanner.throwFor(Scanner.java:939)
//        at java.base/java.util.Scanner.next(Scanner.java:1594)
//        at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
//        at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
//        at com.javaprogramming.Example.getInt(Example.java:22)
//        at com.javaprogramming.Example.divide(Example.java:13)
//        at com.javaprogramming.Example.main(Example.java:8)
