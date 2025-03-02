package com.jspider.program.src.oops.polymorphism.method_overriding;

public class Driver {
    public static void main(String[] args) {
        TwoDShape s1= new Circle(); // Upcasting
        TwoDShape s2= new Rectangle();
        s1.area();// Overriding
        s2.area();


        // We can use it in project
       // TwoDShape t1= selectShape();
    }
}
