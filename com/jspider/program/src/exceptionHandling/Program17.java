package com.jspider.program.src.exceptionHandling;

public class Program17 {
    public static void main(String[] args) {
        System.out.println("Main starts!!");
        try {
            Program16.printNumber(6);
        }catch(Exception e) {
            System.out.println("Exception caught!");
        }
        System.out.println("Program Ends!!");
    }

}
