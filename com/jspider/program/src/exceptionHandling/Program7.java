package com.jspider.program.src.exceptionHandling;
import java.util.Scanner;
public class Program7 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a: ");
        int a=scn.nextInt();
        System.out.println("Enter b: ");
        int b=scn.nextInt();
        System.out.println(a+"+"+b+"= "+(a+b));
        System.out.println(a+"-"+b+"= "+(a-b));
        try {
            System.out.println("try block starts");
            System.out.println(a+"/"+b+"= "+(a/b));
            System.out.println("try block ends!");
        }
        catch(ArithmeticException e) {

            System.out.println("====catch block=====");
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println("========");
            e.printStackTrace();
            System.out.println("=========");
        }
        catch(Exception e) {
            System.out.println("Other exception is caught!");
        }
        System.out.println(a+"*"+b+"= "+(a*b));
        System.out.println("Program Ends!!");
    }
}
