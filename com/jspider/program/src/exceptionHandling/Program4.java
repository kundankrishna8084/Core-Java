package com.jspider.program.src.exceptionHandling;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a");
        int a= scn.nextInt();
        System.out.println("Enter b");
        int b=scn.nextInt();
        System.out.println(a+"+"+b+"="+(a+b));
        System.out.println(a+"-"+b+"="+(a-b));
        try {
            System.out.println(a + "/" + b + "= " + (a / b));
        }catch (ArithmeticException e){
            System.out.println(a+"/"+b+"= Infinity");
            System.out.println(e.getMessage());
        }

        System.out.println(a+"*"+b+"= "+(a*b));
        System.out.println("Program Ends!!");
    }
}
