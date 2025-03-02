package com.jspider.program.src.java8;

public class Bike  implements Vehicle{
    @Override
    public void start() {
        System.out.println("Bike started");
    }

    public static void main(String[] args) {
        Bike b1 = new Bike();
        b1.start();
    }
}
