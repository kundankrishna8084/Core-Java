package com.jspider.program.src.operator;

public class LogicalOr {
    public static void main(String[] args) {
        int a=20;
        int b=30;
        System.out.println(a++ >25 || b++>20);//true
        System.out.println(a);//21
        System.out.println(b);//31
    }
}
