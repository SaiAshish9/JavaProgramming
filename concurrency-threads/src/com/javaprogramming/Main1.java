package com.javaprogramming;

// A process is a unit of execution that has its own memory space
// Each instance of JVM runs as a process (that isn't true for all JVM implementations)

// If one java application runs at one time ,it's
// memory space in heap can be shared with another one
// Both will have their own memory space

// thread is a unit of execution within a process
// each process has multiple threads
// each process has at least one thread
// Every thread created by a process shares process's memory and files

// to break large process into smaller steps
// using multi threading such threads involving large tasks
// can be run on background

// when a api reaches a certain point we can run our own thread

// concurrency
// application doing more than one tasks
// progress can be made on more than one task
// concurrency means that one task doesn't have to complete
// another can start . We can implement this using thread-related classes


import static com.javaprogramming.ThreadColor.*;

public class Main1 {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "main1");
        Thread anotherThread=new AnotherThread();
        anotherThread.start();

//        enables jvm to run run method from thread
        new Thread(){
            @Override
            public void run() {
                System.out.println( ANSI_GREEN + "anonymous");
            }
        }.start();
//        thread runs at background
        Thread myRunnableThread=new Thread(new MyRunnable(){
            @Override
            public void run() {
                System.out.println(ANSI_RED + "anonymous ");
            }
        });
        myRunnableThread.start();
        myRunnableThread.interrupt();

        System.out.println( ANSI_PURPLE+  "main1a");
//        we can use anotherThread.start() more than once
    }
}
