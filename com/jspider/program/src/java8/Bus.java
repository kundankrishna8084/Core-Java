package com.jspider.program.src.java8;

public class Bus implements  Vehicle{
    @Override
    public void start() {
        System.out.println("Bus Started");
    }

    @Override
    public void clean() {
        System.out.println("Car Clean method");
    }

    public static void main(String[] args) {
        Bus b= new Bus();
        b.start();
    }
}
