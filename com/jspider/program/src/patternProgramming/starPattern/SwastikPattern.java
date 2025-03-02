package com.jspider.program.src.patternProgramming.starPattern;

import java.util.Scanner;

public class SwastikPattern {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter your Number:");
        int n=scn.nextInt();
        swastikPattern(n);
    }
    public static void swastikPattern(int n){
                  /*
   *    *  *  *
   *    *
   *  * *  *  *
        *     *
   *  * *     *
                 */
        int mid=n/2+1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++) {
                if(i==mid ||j==mid ||i==1 && j>mid || i==n && j<mid || j==1 && i<mid || j==n && i>mid)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
