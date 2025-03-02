package com.jspider.program.src.java8;

public class Car implements Vehicle {
    public void start(){
        System.out.println("Car Started");
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.start();
    }

}
