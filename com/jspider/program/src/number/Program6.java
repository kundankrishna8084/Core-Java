package com.jspider.program.src.number;

public class Program6 {
    static int x=70;
    public static void main(String[] args) {
        int x=90;
        System.out.println("Local x is:"+x);
        System.out.println("Static x is:"+Program6.x);
    }
}
