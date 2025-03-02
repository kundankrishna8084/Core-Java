package com.jspider.program.src.patternProgramming.numberPattern;
import java.util.Scanner;
public class DiamondNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your number:");
        int n = scn.nextInt();
        printPattern(n);


    }
    public static void printPattern(int n) {
        if(n%2==0){
            System.out.println("The row value must be odd");
            return;
        }
        int mid = n / 2 + 1;
        int val= 1;
        int space = n/2;
        int count=0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= val; j++) {
                System.out.print(j +" ");


            }
            if (i < mid) {
                val=val+2;
                space--;
            } else {
                val=val-2;
                space++;
            }
            System.out.println();

        }
    }
}
