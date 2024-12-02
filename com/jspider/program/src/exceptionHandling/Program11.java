package com.jspider.program.src.exceptionHandling;
import java.util.Scanner;
public class Program11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a: ");
        int a=sc.nextInt();
        System.out.println("Enter b: ");
        int b=sc.nextInt();
        System.out.println(a+"+"+b+"= "+(a+b));
        System.out.println(a+"-"+b+"= "+(a-b));
        try {
            System.out.println("Try block starts");
            System.out.println(a+"/"+b+"= "+(a/b));
        }
        catch(Exception e) {
            System.out.println(a+"/"+b+"= Infinity");
        }
        finally {
            System.out.println("===finally starts======");
            System.out.println(10/0);
            System.out.println("Inside finally block");
            sc.close();
            System.out.println("===finally ends=======");
        }
        System.out.println(a+"*"+b+"= "+(a*b));
        System.out.println("Program Ends!!");
    }
}
