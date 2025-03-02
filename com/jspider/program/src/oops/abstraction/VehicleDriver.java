
package com.jspider.program.src.oops.abstraction;
public class VehicleDriver {
    public static void main(String[] args) {

        Car c1 = new ElectricCar();//upcasting
        c1.start();
        c1.stop();
        c1.openGate();
    }
}
