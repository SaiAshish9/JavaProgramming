package com.javaprogramming;

public class StringUtilities {
    private StringBuilder sBuilder=new StringBuilder();
    private int charsAdded=0;
// field watch point

    public void addChar(StringBuilder sBuilder,char c){
        sBuilder.append(c);
        charsAdded++;
    }

}
