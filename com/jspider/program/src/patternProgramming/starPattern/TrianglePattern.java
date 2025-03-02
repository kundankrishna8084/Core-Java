package com.jspider.program.src.patternProgramming.starPattern;

import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your number");
        int n= scn.nextInt();
        triangle(n);


    }
    public static void triangle(int n){
        int star=1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=star; j++) {
                System.out.print("* ");
            }
            star++;
            System.out.println();
        }

    }
}
