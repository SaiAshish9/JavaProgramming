package com.javaprogramming;

public class Player {
    private String name;
    private int health;

    public int healthRemaining(){
        return this.health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        this.health=10;
        return health;
    }
}
