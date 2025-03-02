package com.jspider.program.src.patternProgramming.starPattern;

public class Pattern1 {
    public static void main(String[] args) {
        // Outer Loop and for row  generation
        for (int i=1;i<=6;i++){
            for (int j=1;j<=4;j++){
                //inner loop and for column generation
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
