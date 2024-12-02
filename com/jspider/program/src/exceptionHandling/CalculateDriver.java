package com.jspider.program.src.exceptionHandling;

public class CalculateDriver {
    public static void main(String[] args) {
        int x=10;
        int y=12;
        try {
            CalculateTest.getResult(x, y);
        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println("Program Ends!!");

    }
}
