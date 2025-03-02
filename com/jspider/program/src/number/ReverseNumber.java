package com.jspider.program.src.number;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your Number");
        int n = scn.nextInt();
        int result =getReverse(n);
        System.out.println("Reverse Number is:"+result);
    }
    public static int getReverse(int n){
        int rev=0;
        int digit=0;
        while(n>0){
             digit=n%10;
            rev=10*rev+digit;
            n=n/10;
        }
        return rev;
    }
}
