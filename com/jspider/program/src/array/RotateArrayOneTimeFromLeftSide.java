package com.jspider.program.src.array;

import java.util.Scanner;

public class RotateArrayOneTimeFromLeftSide {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a []  = {12,18,20,30,40,50,60,70};
        System.out.println("Enter your rotation number:");
        int  k =scn.nextInt();

        if(k% a.length==0)
            return;
        k=k% a.length;

        swapArray(a,0,a.length-1);
        swapArray(a,0,a.length-k-1);
        swapArray(a,a.length-k,a.length-1);



    }



    public static void swapArray(int [] a,int start,int end){
        if(start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }

}
