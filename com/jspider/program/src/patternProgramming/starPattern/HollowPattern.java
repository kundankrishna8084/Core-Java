package com.jspider.program.src.patternProgramming.starPattern;
import java.util.Scanner;
public class HollowPattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your Number:");
        int n=scn.nextInt();
        hollowPattern(n);

    }
    public static void hollowPattern(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if (i <= 2 || i >= n - 1 || j <= 2 || j >= n - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }
            System.out.println();

        }

    }
}
