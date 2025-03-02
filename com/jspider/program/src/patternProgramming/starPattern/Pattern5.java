package com.jspider.program.src.patternProgramming.starPattern;

public class Pattern5 {
    public static void main(String[] args) {
        int n=9;
        int star=1;
        int space =n-1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=space ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=star; j++) {
                System.out.print("* ");

            }
            star=star+2;
            space--;

            System.out.println();
        }
    }
}
