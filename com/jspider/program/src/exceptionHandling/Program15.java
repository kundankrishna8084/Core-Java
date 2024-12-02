package com.jspider.program.src.exceptionHandling;

public class Program15 {
    public static void main(String[] args) {
         test();
    }
    public static void test(){
        System.out.println(" This is test method");
       test();
    }
}
