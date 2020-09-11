package com.javaprogramming;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] array){
        for(int i=0;i<array.length/2;i++){
         int t=array[i];
         array[i]=array[array.length-i-1];
         array[array.length-i-1]=t;
        }
    }

}
