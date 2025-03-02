package com.jspider.program.src.patternProgramming.starPattern;
import java.util.Scanner;
public class Pattern2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = scn.nextInt();
        // Outer Loop and for row  generation
        for (int i=1;i<=n;i++){
            //inner loop and for column generation
            for (int j=1;j<=n-4;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
