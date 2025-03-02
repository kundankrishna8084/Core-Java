
package com.jspider.program.src.DigitProblem;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your Number:-");
        int n= scn.nextInt();
        palindrome(n);
    }
    public static void palindrome(int n){
        int reverse=0;
        int original=n;
        while (n>0){
            int rem=n%10;
            reverse=reverse*10+rem;
            n=n/10;
        }
        System.out.println("Original Number: "+original);
        System.out.println("Reverse Number: "+reverse);
        if(original==reverse){
            System.out.println("Palindrome Number");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
