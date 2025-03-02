package com.jspider.program.src.number;

public class Program15 {
    public static void main(String[] args) {
        System.out.println("Main method");
        demo();
        System.out.println("Main ends");
    }
    public static void test(){
        System.out.println("This is test method");
    }
    public static void demo(){
        System.out.println("This is demo method");
        test();
        System.out.println("Demo ends");
    }
}
