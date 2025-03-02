package com.jspider.program.src.recursion;

import java.util.Scanner;

public class FindHcf {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your 1st number ");
        int a= scn.nextInt();
        System.out.println("Enter your 2nd number ");
        int b= scn.nextInt();
        int gcd=getGcd(a,b);
        System.out.println(gcd);

    }
    public static int getGcd(int a, int b){
        int small=a<b?a:b;
        for (int i = small;  ; i--) {
            if(a%i==0 && b%i==0)
                return i;

        }
    }
}
