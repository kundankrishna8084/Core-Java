package com.jspider.program.src.constructor.copyConstrutor;

public class FruitDriver {
    public static void main(String[] args) {
        Fruit f1 = new Fruit("Mango",120,3.6);
        Fruit f2 = new Fruit(f1);//Isliye pale  constructor banake use f1 ko initialize karege
        double x=30.8;
        Fruit f3 = new Fruit(x);
    }
}
