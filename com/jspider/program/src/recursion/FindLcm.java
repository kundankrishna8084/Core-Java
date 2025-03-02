package com.jspider.program.src.recursion;

import java.util.Scanner;

public class FindLcm {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter your 1st number");
        int a= scn.nextInt();
        System.out.println("Enter your  2nd number ");
        int b= scn.nextInt();
        int l=getLcm(a,b);
        System.out.println("Lcm is:"+l);

    }
    public static int getLcm(int a, int b){
        int big=a>b?a:b;
        for (int i = big;  ;i+=big) {
            if(i%a==0 && i%b==0)
                return i;

        }
    }
}
