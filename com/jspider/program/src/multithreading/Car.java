
package com.jspider.program.src.multithreading;

public class Car extends Thread{

    public void run(){
        drive();
    }
    public void drive(){
        System.out.println("Drive Starts");
        for (int i = 1; i <10 ; i++) {
            System.out.println("Car Completes"+i+"km");
            System.out.println("Drive Ends");
        }
    }


}
