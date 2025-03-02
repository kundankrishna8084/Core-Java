package com.jspider.program.src.patternProgramming.numberPattern;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your Number");
        int n=scn.nextInt();
        for (int i=1;i<=5;i++){
            for (int j=1;j<=n;j++){
                System.out.print("("+i+","+j+")");

            }
            System.out.println();
        }
    }
}
