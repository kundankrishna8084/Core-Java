package com.jspider.program.src.constructor;

public class Laptop {
    int id;
    String name;
    double price;
    String modelNumber;
    String generation;
    String core;

    Laptop(){
        System.out.println("No-arg constructor");
    }
    // Parameterized constructor
    Laptop(int id, String name, double price, String modelNumber, String generation, String core) {
        // Initializing instance variables with parameter values
        this.id = id;
        this.name = name;
        this.price = price;
        this.modelNumber = modelNumber;
        this.generation = generation;
        this.core = core;

        System.out.println("Parameterized constructor called.");
    }

    // Method to display the details of the laptop
    public void displayDetails() {
        System.out.println("Laptop Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Generation: " + generation);
        System.out.println("Core: " + core);
    }
}
