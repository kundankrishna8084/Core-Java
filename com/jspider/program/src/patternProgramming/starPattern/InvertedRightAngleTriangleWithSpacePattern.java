package com.jspider.program.src.patternProgramming.starPattern;

public class InvertedRightAngleTriangleWithSpacePattern {
    public static void main(String[] args) {
        int n=7;
        int star=7;
        int space=0;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=space ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=star ; j++) {
                System.out.print("* ");
            }
            star--;
            space++;
            System.out.println();

        }

    }
}
/*
* * * * * * *
  * * * * * *
    * * * * *
      * * * *
        * * *
          * *
            *
 */