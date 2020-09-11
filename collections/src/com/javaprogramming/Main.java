package com.javaprogramming;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(String.format(" %d sai",1));
        Map<String,String> languages=new HashMap<>();
        languages.put("Java","abcd");
        languages.put("Python","dynamic semantics");
        languages.put("Algol","Algorithmic Language");
        System.out.println(languages.get("Java"));
        System.out.println(languages.containsKey("Java"));
        for(String key:languages.keySet()){
            System.out.println(key+":"+languages.get(key));
        }
        languages.remove("Algol");
        languages.replace("Java","High level language");
//        System.out.println(languages);
        for(String key:languages.keySet()){
            System.out.println(key+":"+languages.get(key));
        }
        Map<String,Integer> check=new HashMap<>();
        check.put("a",1);
        System.out.println(check.get("a"));
        Map<String,Map<String,Integer>> test=new HashMap<>();
        test.put("a",check);
        for(String k:test.keySet()){
            System.out.println(k+":"+test.get(k));
        }
    }
}
