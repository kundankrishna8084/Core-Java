package com.jspider.program.src.exceptionHandling;
import java.util.*;
public class Program9 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a: ");
        int a=scn.nextInt();
        System.out.println("Enter b: ");
        int b=scn.nextInt();
        System.out.println(a+"+"+b+"= "+(a+b));
        System.out.println(a+"-"+b+"= "+(a-b));
        try {
            System.out.println("Try block starts");
            System.out.println(a+"/"+b+"= "+(a/b));
            System.exit(0);
            System.out.println("Try block ends!");
        }
        catch(Exception e) {
            System.out.println(a+"/"+b+"= Infinity");
        }
        finally {
            System.out.println("===finally starts======");
            scn.close();
            System.out.println("===finally ends=======");
        }
        System.out.println(a+"*"+b+"= "+(a*b));
        System.out.println("Program Ends!!");
    }
}
