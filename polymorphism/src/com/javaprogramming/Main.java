package com.javaprogramming;

import static java.lang.Math.random;

class Movie {
    public String name;

    public String getName() {
        return name;
    }

    public Movie(String name) {
        this.name = name;
    }
    public String plot() {
        return "No plot here";
    }
}

class Jaws extends Movie{
    public Jaws() {
        super("name");
    }
    public String plot(){
        return "A shark easts lots of people";
    }
}

class Independently extends Movie{
    public Independently(){
        super("Independence Day");
    }
    @Override
    public String plot() {
        return "independently";
    }
}


public class Main {

    public static void main(String[] args) {
	// write your code here
        for(int i=1;i<5;i++){
            Movie movie=randomMovie();
            System.out.println(
                    "Movie #" + i + movie.getName() + "\n"+ movie.plot()
            );
        }
    }

    public  static  Movie randomMovie(){
       int randomNumber=(int)(random()*5)+1;
       switch (randomNumber){
           case 1:
               return new Jaws();
           case 2:case 3:case 4 : case 5:
               return new Independently();
//           default:
//               return null;
       }
       return null;
    }

}
