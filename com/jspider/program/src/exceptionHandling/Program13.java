package com.jspider.program.src.exceptionHandling;

public class Program13 {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++) {
            System.out.println("i is: "+i);
            try {
                Thread.sleep(800);
                // it can stop for given time and run the loop.
                // it always pauses the current thread execution for the given time .
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
