package com.jspider.program.src.constructor;

public class LaptopDriver {
    public static void main(String[] args) {
        // Using the no-argument constructor
        Laptop laptop1 = new Laptop();

        // Using the parameterized constructor
        Laptop laptop2 = new Laptop(1, "Dell Inspiration", 800.99, "INS1234", "12th Gen", "i7");

        // Displaying details of the laptop created with the parameterized constructor
        laptop2.displayDetails();
    }
}
