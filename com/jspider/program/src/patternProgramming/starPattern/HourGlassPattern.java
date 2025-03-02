package com.jspider.program.src.patternProgramming.starPattern;

import java.util.Scanner;

public class HourGlassPattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n=scn.nextInt();
        int star=n;
        int space=0;
        int mid=n/2+1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=space;j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= star ; j++) {

                System.out.print("* ");

            }
            if(i<mid){
                space++;
                star=star-2;
            }else {
                space--;
                star=star+2;
            }
            System.out.println();

        }
    }
}
