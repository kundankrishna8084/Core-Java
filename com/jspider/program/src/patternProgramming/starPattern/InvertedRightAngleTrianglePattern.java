package com.jspider.program.src.patternProgramming.starPattern;

public class InvertedRightAngleTrianglePattern {
    public static void main(String[] args) {
        int n=5;
        int star=5;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=star; j++) {
                System.out.print("* ");
            }
            star--;
            System.out.println();

        }
    }
}



//* * * * *
//* * * *
//* * *
//* *
//*