package com.jspider.program.src.patternProgramming.starPattern;

import java.util.Scanner;

public class RombhusWithSpace {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your number:");
        int n = scn.nextInt();
        printPattern(n);
    }

    public static void printPattern(int n) {
        int mid = n / 2 + 1;
        int star = 1;
        int space = n - 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*   ");

            }
            if (i < mid) {
                star++;
                space--;
            } else {
                star--;
                space++;
        }
            System.out.println();

        }
    }
}



