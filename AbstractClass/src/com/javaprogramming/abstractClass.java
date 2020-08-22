package com.javaprogramming;

public abstract class abstractClass {
    private  String name;

    public abstractClass(String name) {
        this.name = name;
    }

    public abstract void eat();
    public abstract void breathe();

    public String getName() {
        return name;
    }
}
