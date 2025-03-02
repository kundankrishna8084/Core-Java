package com.jspider.program.src.constructor;

public class VehicleDriver {
    public static void main(String[] args) {
      Vehicle v1 = new Vehicle();
        System.out.println("==============================");
        v1.demo();
      Vehicle v2 = new Vehicle("Toyota", "Camry", 2022, "White", 2.5);


        System.out.println("==============================");
      v2.demo();
    }
}
