package com.jspider.program.src.exceptionHandling;
public class Program1 {
    public static void main(String[] args) {
        System.out.println("program starts");
        System.out.println(12+40*8);

        try{
            System.out.println(12+40/0);
            System.out.println("Program run Successful");
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("Handle by catch block");
        }
        System.out.println(30+50*4);
        System.out.println(56+67*2);
        System.out.println("Program ends");

    }
}
