package com.jspider.program.src.patternProgramming.numberPattern;

import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n=scn.nextInt();
       int val=1;
       int count=1;
        //row
        for (int i = 1; i <=n; i++) {
            //column
            for (int j = 1; j <=val ; j++) {
                System.out.print(count +" ");
                count++;
            }
            val++;
            System.out.println();
        }
    }
}
/*
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

 */