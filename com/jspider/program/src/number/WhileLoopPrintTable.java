package com.jspider.program.src.number;

import java.util.Scanner;

public class WhileLoopPrintTable {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int i=10;
       int n = scn.nextInt();
       while (i>=1){
           System.out.println(n*i);
           i--;

       }

    }
}
