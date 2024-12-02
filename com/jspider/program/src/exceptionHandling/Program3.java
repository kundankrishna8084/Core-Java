package com.jspider.program.src.exceptionHandling;

public class Program3 {
    public static void main(String[] args) {
        int[] a= {12, 34, 56, 77, 20, 32};
        System.out.println("program starts");
        System.out.println(12+40*8);
        System.out.println(a[2]);
        try {
            a[-2] = 100;
            System.out.println("program Execute");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println("Program not working");
        }
        System.out.println(30+50*4);
        System.out.println(56+67*2);
        System.out.println("Program ends");

    }
}
