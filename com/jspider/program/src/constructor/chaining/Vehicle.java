package com.jspider.program.src.constructor.chaining;

public class Vehicle {
    Vehicle(){
        System.out.println("No-arg constructor");
    }

    Vehicle(int x){
        this();
        System.out.println("Vehicle int arguments:"+x);
    }

    Vehicle(int x, int y){
        this(x);
        System.out.println("Vehicle int, int arguments constructor:"+ x +" "+ y);
    }
}
