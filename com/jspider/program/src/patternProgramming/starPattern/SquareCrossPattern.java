package com.jspider.program.src.patternProgramming.starPattern;
import java.util.*;
public class SquareCrossPattern {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter your Number:");
        int n=scn.nextInt();
        squareCrossPattern(n);

    }
    public static void squareCrossPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++) {
                if(i==1 || i==n ||j==1 || j==n || i==j || i+j==n+1 )
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

}
