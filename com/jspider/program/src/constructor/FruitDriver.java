package com.jspider.program.src.constructor;
public class FruitDriver {
    public static void main(String[] args) {
        Fruit.test(); // Ths is static method which is called by class reference.

        //non-static method can call by object reference then create and call method
        Fruit f1 = new Fruit();
        //new Fruit() call the constructor which is present in fruit class
        f1.demo();
    }
}
