package com.jspider.program.src.recursion;

public class Program1 {
    public static void main(String[] args) {
        System.out.println("main starts");
        test();
        System.out.println("Main ends");
    }
    public static void test(){
        System.out.println("This is test method");
        test();
    }
}
