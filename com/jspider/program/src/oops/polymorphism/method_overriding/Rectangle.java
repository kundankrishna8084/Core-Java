package com.jspider.program.src.oops.polymorphism.method_overriding;

public class Rectangle extends TwoDShape {
    @Override
    public void area() {
        System.out.println("Area of Rectangle is: L*W");
    }
}
