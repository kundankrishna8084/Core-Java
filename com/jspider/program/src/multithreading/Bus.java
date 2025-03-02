package com.jspider.program.src.multithreading;

public class Bus extends Vehicle implements Runnable{
    @Override
    public void run(){
        startVehicle();
        drive();
    }

    public void drive() {
        System.out.println("Drive Starts");
        for (int i = 1; i <10 ; i++) {
            System.out.println("Bus Complete"+i+"KM");
            System.out.println("Drive Ends");
        }
    }
}
