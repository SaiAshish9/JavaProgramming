package com.javaprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Echoer extends Thread {
    private Socket socket;

    public Echoer(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try{
            BufferedReader input=new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );
            PrintWriter output=new PrintWriter(socket.getOutputStream(),true);

            while (true){
               String echoString=input.readLine();
               if(echoString.equals("exit")){
                  break;
               }

// User Datagram Protocol (UDP) –
// a communications protocol that
// facilitates the exchange of
// messages between computing
// devices in a network. It's
// an alternative to the transmission
// control protocol (TCP).

               try{
                   Thread.sleep(15000);
               }catch (InterruptedException e){
                   System.out.println("Interrupted server");
               }

               output.println(echoString);
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
             try{
                 socket.close();
             }catch (IOException e){

             }
        }
    }
}
