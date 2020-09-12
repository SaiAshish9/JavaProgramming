package com.javaprogramming;

// regular expressions are a way to represent strings
// or numbers
// matches replaceAll split work with regex expressions
// regex expressions are often used to search strings
// with regular pattern

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        System.out.println("harry".replaceAll("[Hh]arry","Harry"));
        String newAlphanumeric="abcDeeeF12Ghhiiijkli99z";
        System.out.println(newAlphanumeric.replaceAll("[^De]","99"));
        System.out.println(newAlphanumeric.replaceAll("[a-f45-9]","X"));
        System.out.println(newAlphanumeric.replaceAll("(?i)[a-f3-8]","X"));
// ignoreCase
        System.out.println(alphanumeric.replaceAll("[0-9]","X"));
        System.out.println(alphanumeric.replaceAll("\\d","Y"));
        System.out.println(alphanumeric.replaceAll("\\D","X"));

        String hasWhiteSpace="a  b \tc\nd";
        System.out.println(hasWhiteSpace.replaceAll("\\s",""));
        System.out.println(hasWhiteSpace.replaceAll("\t","X"));
        System.out.println(hasWhiteSpace.replaceAll("\\S","Y"));
        System.out.println(newAlphanumeric.replaceAll("\\w","X"));
        System.out.println(hasWhiteSpace.replaceAll("\\w","Y"));
        System.out.println(hasWhiteSpace.replaceAll("\\b","Y"));
//    each word will be surrounded by y

//    d D b w t s S ^[] $ [^] [][] * + - {}

        alphanumeric="abcDeeeF12Ghhiiijkli99z";
        System.out.println(alphanumeric.replaceAll("^abcD","YYY"));
        System.out.println(alphanumeric.replaceAll("^abcDe{3}","YYY"));
        System.out.println(alphanumeric.replaceAll("^abcDe+","000"));
        System.out.println(alphanumeric.replaceAll("^abcDe*","000"));
//any e
        System.out.println(alphanumeric.replaceAll("^abcDe{4,5}","YYY"));
        System.out.println(alphanumeric.replaceAll("h+i*j","Y"));

        StringBuilder htmlText=new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This is a paragraph about something.</p>");
        htmlText.append("<p>another para</p>");
        htmlText.append("<h2>Summary</h2>");

//        anything before and anything after .->every character
//        String h2Pattern=".*<h2>.*";
        String h2Pattern="<h2>";
        Pattern pattern=Pattern.compile(h2Pattern);
        Matcher matcher=pattern.matcher(htmlText);
        System.out.println(htmlText);
        System.out.println(matcher.matches());

//        reset entire state
        matcher.reset();
        int count=0;
        while (matcher.find()){
            count++;
            System.out.println(count + " : "+ matcher.start() + " to " + matcher.end());
        }

//        .any character
//        * one or more
//        ? * quantifier into lazy quantifier
        String h2Group ="(<h2>.*?</h2>)";
        Pattern groupPattern = Pattern.compile(h2Group);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
        groupMatcher.reset();

        while (groupMatcher.find()){
            System.out.println(groupMatcher.group(1));
        }

        String h2TextGroup="(<h2>(.+?)</h2>)";
        Pattern h2TextPattern=Pattern.compile(h2TextGroup);
        Matcher h2TextMatcher=h2TextPattern.matcher(htmlText);

        while (h2TextMatcher.find()){
            System.out.println(h2TextMatcher.group(2));
        }

        System.out.println("harry".replaceAll("[H|h]arry","Larry"));
        String tvTest="tstvtkt";
//        String tNotVRegExp="t[^v]";
//        ? ->  breaks
//        ! -> matched instances of t at end
        String tNotVRegExp="t(?!v)";
        Pattern tNotVPattern=Pattern.compile(tNotVRegExp);
        Matcher tNotVMatcher=tNotVPattern.matcher(tvTest);

        count=0;
        while (tNotVMatcher.find()){
            count++;
            System.out.println(count +" "+ tNotVMatcher.start() +" to "+ tNotVMatcher.end());
        }

        String phone1="4444444444444";
        String phone2="5444444444444";
        String phone3="4444444444444443";
        String phone4="444";

        System.out.println(phone1.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println(phone2.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println(phone3.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println(phone4.matches("^4[0-9]{12}([0-9]{3})?$"));

    }
}
