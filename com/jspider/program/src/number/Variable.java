package com.jspider.program.src.number;

public class Variable {
    //Here variable name is ClassName

    static int a=30;
    static int b=40;
    static double c=18.5;
    public static void main(String[] args) {
        System.out.println("Main starts Here");
        System.out.println("A is:"+a);
        System.out.println("B is:"+Variable.b);// Class name se access kar rahe hai
        System.out.println("B is:"+b); // Same class me class reference nhi bhi le to error nhi hota hai.
        System.out.println("C is:"+c);// Ye direct access of static variable
    }
}
