package com.javaprogramming;


import static com.javaprogramming.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread {

    @Override
    public void run() {
        System.out.println( ANSI_BLUE + "another");
        try{
            Thread.sleep(3000);

        }catch (InterruptedException e){
            System.out.println( ANSI_BLUE + "Another thread woke me up");
        }
        System.out.println(ANSI_BLUE + "awake");
    }

}
