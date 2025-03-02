package com.jspider.program.src.oops.polymorphism.method_overloading;

public class Calculator {

    public static void add(int a){
        System.out.println("Int value Only");
    }

    public static void add(int a, double d){
        System.out.println("Int and double Value");
    }

    public static void add(double s, double d){
        System.out.println("Both are double value");
    }
}
