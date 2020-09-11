package com.javaprogramming;

// regular expressions are a way to represent strings
// or numbers
// matches replaceAll split work with regex expressions
// regex expressions are often used to search strings
// with regular pattern

public class Main1 {
    public static void main(String[] args) {
        String string="lorem ipsum";
        System.out.println(string);
        String s2=string.replaceAll(
                "l","L"
        );
        System.out.println(s2);

        String alphanumeric="abcDeeeF12Ghhiiijkli99z";
        System.out.println(alphanumeric.replaceAll(".","y"));
        System.out.println(alphanumeric.replaceAll("^abcD","YYY"));

        String s3="abcDeeeF12abcDehijkl99z";
        System.out.println(alphanumeric.replaceAll("^abcD","YYY"));
        System.out.println(s3.matches("^hello"));
        System.out.println(s3.replaceAll("l99z$","99"));
        System.out.println(s3.replaceAll("[ae]","9"));
        System.out.println(s3.replaceAll("[hlD][iee]","0"));
    }
}
