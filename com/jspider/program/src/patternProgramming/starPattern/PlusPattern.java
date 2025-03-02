package com.jspider.program.src.patternProgramming.starPattern;
import java.util.Scanner;
public class PlusPattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your Number:");
        int n=scn.nextInt();
        if(n%2==0){
            System.out.println("The no of rows must be odd");
            return;
        }
        int mid =n/2+1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==mid ||j==mid)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
