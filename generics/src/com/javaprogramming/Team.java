package com.javaprogramming;
import java.util.ArrayList;

public class Team<T> {
    private String name;
    int player=0;
    int won=0;
    int lost=0;

    private ArrayList<T> members=new ArrayList<>();

    public String getName() {
        return name;
    }

    public Team(String name) {
        this.name = name;
    }

//    public boolean addPlayer(T player){
//        if(members.contains(player)){
//            System.out.println(((T) player).getName());
//            return false;
//        }else{
//            members.add(player);
//            System.out.println(((T) player).getName()+" " +this.name);
//            return  true;
//        }
//    }

    public int numPlayers(){
        return this.members.size();
    }

}
