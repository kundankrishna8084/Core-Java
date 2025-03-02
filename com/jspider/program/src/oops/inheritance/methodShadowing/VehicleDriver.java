
package com.jspider.program.src.oops.inheritance.methodShadowing;
public class VehicleDriver {
    public static void main(String[] args) {
        Vehicle v1= new Car();
        Vehicle v2= new Bike();
        Vehicle v3= new Bus();

        v1.start();
        v2.start();
        v3.start();
    }
}
