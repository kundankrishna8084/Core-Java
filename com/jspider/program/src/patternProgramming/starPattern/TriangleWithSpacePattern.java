package com.jspider.program.src.patternProgramming.starPattern;

public class TriangleWithSpacePattern {
    public static void main(String[] args) {
        int n = 16;
        int star=1;
        int space=n-star;
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <=space; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=star; j++) {
                System.out.print("* ");

            }
            star++;
            space--;
            System.out.println();

        }
    }
}
