package com.jspider.program.src.number;
import java.util.Scanner;
public class PrintNumberEndsWithSevenAndDivisibleBySevenAndCountOccurence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your starting  Number");
        int start=scn.nextInt();
        System.out.println("Enter the end Number");
        int end=scn.nextInt();
        int count=0;
        for (int i = start; i < end; i++) {
            if(i%10==7 && i%7==0 ) {
                count++;
                System.out.println(i + " ");
            }

        }
        System.out.println("Count is:"+ count);
    }
}
