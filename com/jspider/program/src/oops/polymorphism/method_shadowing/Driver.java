package com.jspider.program.src.oops.polymorphism.method_shadowing;

public class Driver {
    public static void main(String[] args) {
        Vehicle.start();
        Car.start();
        Bike.start();

        System.out.println("==============================");
        // There is no need to create object static method are call by its class name
        Vehicle v1= new Car();
        Vehicle v2= new Bike();
        v1.start();
        v2.start();


    }
}
