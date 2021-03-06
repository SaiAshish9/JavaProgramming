package com.javaprogramming;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear=0;
    private boolean clutchIsIn;


    public Gearbox(int maxGears){
        this.maxGears=maxGears;
        this.gears=new ArrayList<>();
        Gear neutral=new Gear(0,0.0);
        this.gears.add(neutral);
    }

    public void operateClutch(boolean in){
        this.clutchIsIn=in;

    }

    public void addGear(int number,double ratio){
        if(number>0 && number<= maxGears ) {
        this.gears.add(new Gear(number,ratio));
        }
    }

    public void changeGear(int newGear){
        if(newGear>=0 && newGear<this.gears.size() && this.clutchIsIn){
            this.currentGear=newGear;
            System.out.println("selected");
        }else{
            System.out.println("Grind");
            this.currentGear=0;
        }
    }

    private class Gear {

        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double drive(int revs){
            return revs * (this.ratio);
        }

    }

}
