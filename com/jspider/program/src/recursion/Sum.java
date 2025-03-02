package com.jspider.program.src.recursion;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Range");
        int range= scn.nextInt();
        int sum=getSum(range);
        System.out.println("Sum is:"+sum);
    }
    public static int getSum(int n){
        if(n>1)
            return n+getSum(n-1);
        else
            return n;
    }
}
