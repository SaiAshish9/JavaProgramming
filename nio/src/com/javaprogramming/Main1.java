package com.javaprogramming;

// threads using java.nio classes will not block
// they are free to continue executing,so java.nio was introduced as a performance improvement

import java.io.*;
import java.nio.file.*;
import java.util.List;

//nio- non blocking io

//   a stream can be defined as a sequence of data.
//   The InputStream is used to read data
//   from a source and the OutputStream is used for writing data to a destination. Here is a hierarchy of classes to deal with Input and Output streams.

public class Main1 {

    public static void main(String[] args) {
       try{
//           FileInputStream file=new FileInputStream("data.txt");
//           FileChannel channel=file.getChannel();
//           converting string to bytes
           Path dataPath= FileSystems.getDefault().getPath("data.txt");
           Files.write(dataPath,"\nLine 4".getBytes("UTF-8"), StandardOpenOption.APPEND);
           List<String> lines= Files.readAllLines(dataPath);
           for(String line:lines){
               System.out.println(line);
           }
       }catch (IOException e){
           e.printStackTrace();
       }

        try {
            byte bWrite [] = {11,21,3,40,5};
            OutputStream os = new FileOutputStream("test.txt");
            for(int x = 0; x < bWrite.length ; x++) {
                os.write( bWrite[x] );   // writes the bytes
            }
            os.close();

            InputStream is = new FileInputStream("test.txt");
            int size = is.available();

            for(int i = 0; i < size; i++) {
                System.out.print((char)is.read() + "  ");
            }
            is.close();
        } catch (IOException e) {
            System.out.print("Exception");
        }

    }
}
