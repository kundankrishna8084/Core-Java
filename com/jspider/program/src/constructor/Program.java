package com.jspider.program.src.constructor;

public class Program {
    static {
        System.out.println("This is static block-1");
    }
    public static void main(String[] args) {
        System.out.println("This is main method");
    }

    static {
        System.out.println("This is static block-2");
        int x=30;
        System.out.println("X is:"+x);

    }
}
