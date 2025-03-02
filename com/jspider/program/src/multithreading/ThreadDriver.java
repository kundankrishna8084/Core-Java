
package com.jspider.program.src.multithreading;
public class ThreadDriver {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();
        c1.start();
        System.out.println("==================");
        c2.start();
        System.out.println("====================");
        c3.start();

    }
}
