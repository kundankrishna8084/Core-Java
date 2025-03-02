
package com.jspider.program.src.oops.inheritance.variableShadowing;
public class VehicleDriver {
    public static void main(String[] args) {
        Vehicle v1 =new Car();
        Vehicle v2= new Bike();
        Vehicle v3 = new Bus();
        System.out.println(v1.x);
        System.out.println(v1.y);
        System.out.println(v2.x);
        System.out.println(v2.y);
        System.out.println(v3.x);
        System.out.println(v3.y);
    }
}
