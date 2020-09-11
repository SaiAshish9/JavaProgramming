package com.javaprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Scanner scanner=new Scanner(System.in);
//        int counter=0;
//        int sum=0;
//        while(true){
//            int order=counter+1;
//            System.out.println("Enter number#"+order+":");
//           if(scanner.hasNextInt()){
//               int number=scanner.nextInt();
//               counter++;
//               sum+=number;
//               if(counter==4){
//                   break;
//               }
//           }else{
//               System.out.println("invalid");
//           }
//           scanner.nextLine();
//        }
//        System.out.println("sum="+sum);
//        scanner.close();

    int min=Integer.MIN_VALUE;
    int max=Integer.MAX_VALUE;
    boolean first=true;
    while (true){
        Scanner scanner=new Scanner(System.in);
        boolean isAnInt=scanner.hasNextInt();
        if(isAnInt){
            int number=scanner.nextInt();
            if(first){
                first=false;
                min=number;
                max=number;
            }
            if(number>max){
                max=number;
            }else if(number<min){
                min=number;
            }
        }else{
            break;
        }
    scanner.nextLine();
    }
        System.out.println(max+ " "+ min);
    }
}
