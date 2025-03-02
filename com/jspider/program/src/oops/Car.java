package com.jspider.program.src.oops;

public class Car {
    double price;
    String color;
    int model;
    int hp;
    String name;
    // Here price ,color , model and hp is state of class Car

    public void start(){
        System.out.println("Start the Car");
    }
    public void turn(){
        System.out.println("Turn the Car");
    }
    public void stop(){
        System.out.println("Stop the Car");
    }
    // Here start(), turn() and stop()  is behaviour of Car class
}
