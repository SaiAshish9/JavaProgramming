package com.javaprogramming;

import java.io.*;
import java.util.Scanner;

public class Main1  {

//    first example writes the characters one by one and the second first buffers it to the memory and writes it once

    static {
        Scanner scanner=null;
        try{

            scanner=new Scanner(new BufferedReader(new FileReader("locations.txt")));
            BufferedWriter writer=new BufferedWriter(new FileWriter("locations.txt"));
            writer.append("123");
            writer.close();
//            scanner.useDelimiter(",");
            while (scanner.hasNextLine()){
                    String loc=scanner.nextLine();
//                    System.out.println(scanner.nextInt());
//                    scanner.next();
//                    scanner.skip(scanner.delimiter());
            System.out.println(loc);

            }

        }catch (IOException e){
               e.printStackTrace();
        }finally {
            if(scanner!=null){
                scanner.close();
            }
        }
    }

// Buffer reader reads text from input string and
// buffers the characters into character array

    public static void main(String[] args)  throws IOException {
        FileWriter locFile= null;
        try{
            locFile = new FileWriter("locations.txt");
            int[] x={1,2,3};
            for (int i:x){
                locFile.append("hi,");
            }

        }catch (IOException e){
            System.out.println("In catch block");
            e.printStackTrace();
        }finally {
            try{
                if(locFile != null)
                locFile.close();
            }catch (IOException e){
                 e.printStackTrace();
            }
        }
    }
}

// io is a checked exception