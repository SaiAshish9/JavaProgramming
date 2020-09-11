package com.javaprogramming;

public class Main {

    public static void main(String[] args) {
	Gearbox x=new Gearbox(6);

//	Gearbox.Gear first = x.new Gear(1,12.3);
// error -> Gearbox.Gear second= new Gearbox.Gear(2,15,4)
// error -> Gearbox.Gear third=new x.Gear()

        x.addGear(1,5.3);

//        System.out.println(first.drive(1000));

    }
}
