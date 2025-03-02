package com.jspider.program.src.constructor;

import java.time.Year;
public class Vehicle {
     String make;    // Manufacturer of the vehicle
     String model;   // Model of the vehicle
     int year;       // Manufacturing year
     String color;   // Color of the vehicle
     double engineCapacity; // Engine capacity in liters


    Vehicle(){
        System.out.println("No-arg constructor");
    }

    Vehicle(String make, String model, int year, String color,double engineCapacity){
        this.make=make;
        this.model=model;
        this.year=year;
        this.color=color;
        this.engineCapacity=engineCapacity;
    }
    public void demo(){
        System.out.println("Make:"+make);
        System.out.println("Model:"+model);
        System.out.println("Year:" +year);
        System.out.println("Color:"+color);
        System.out.println("EngineCapacity:"+engineCapacity);
    }
}
