package com.jspider.program.src.exceptionHandling;

public class CarDriver {
    public static void main(String[] args) {
        Car c1 = new Car("TATA");
        System.out.println(c1.name);
        c1= null;
        System.out.println(c1.name);
    }
}
