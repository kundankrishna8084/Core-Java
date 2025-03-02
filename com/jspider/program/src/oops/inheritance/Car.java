package com.jspider.program.src.oops.inheritance;

public class Car extends Vehicle{
    int hp;
    Car(){

        System.out.println(" Car N0-arg constructor");
    }

    Car(int y){

        System.out.println("Car int-arg constructor");
    }
}
