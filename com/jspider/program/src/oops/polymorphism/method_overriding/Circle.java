package com.jspider.program.src.oops.polymorphism.method_overriding;

public class Circle extends TwoDShape{
    @Override
    public void area() {
        System.out.println("Area of Circle is PI*r*r");
    }
}
