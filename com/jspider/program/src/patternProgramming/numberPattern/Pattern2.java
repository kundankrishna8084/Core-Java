package com.jspider.program.src.patternProgramming.numberPattern;
import java.util.Scanner;
public class Pattern2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the no of Rows");
        int n = scn.nextInt();
        printPattern(n);
        // Keep row is equal to column

    }

    public static void printPattern(int n) {
        // Outer Loop and for row  generation
        for (int i = 1; i <= n; i++) {
            //inner loop and for column generation
            for (int j = 1; j <= n; j++) {
                // If you have to print the Column we should go for j in inner loop
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
