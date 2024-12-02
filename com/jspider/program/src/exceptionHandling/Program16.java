package com.jspider.program.src.exceptionHandling;

public class Program16 {
    public static void main(String[] args) {
        System.out.println("Main method starts");
        try {
            printNumber(15);
        }
        catch(InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Program ends!!");
    }
    public static void printNumber(int n) throws InterruptedException, ArithmeticException {
        for(int i=1;i<=n;i++) {
            System.out.println(i);
            Thread.sleep(800);
        }
    }
}
