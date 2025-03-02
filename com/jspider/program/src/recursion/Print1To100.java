package com.jspider.program.src.recursion;

import java.util.Scanner;

public class Print1To100 {
    static int count=1;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println("main starts");
        test(n);
        System.out.println("main ends");
    }
    public  static void test(int n){
        count++;


    }
}
