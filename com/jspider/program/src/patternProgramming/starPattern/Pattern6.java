package com.jspider.program.src.patternProgramming.starPattern;

public class Pattern6 {
    public static void main(String[] args) {
        int n=11;
        int star=2*n-1;
        int space =0;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=space ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=star; j++) {
                System.out.print("* ");

            }
            star=star-2;
            space++;

            System.out.println();
        }
    }
}
