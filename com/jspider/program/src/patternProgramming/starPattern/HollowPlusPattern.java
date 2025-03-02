package com.jspider.program.src.patternProgramming.starPattern;

import java.util.Scanner;

public class HollowPlusPattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your Number:");
        int n=scn.nextInt();
        hollowPlusPattern(n);

    }
    public static void hollowPlusPattern(int n) {
        if (n % 2 == 0) {
            System.out.println("The no of rows must be odd");
            return;
        }
        int mid = n / 2 + 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i ==1 || i== n || j==1 || j== n || i == mid || j == mid)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
