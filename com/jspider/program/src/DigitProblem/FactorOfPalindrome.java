

package com.jspider.program.src.DigitProblem;
import java.util.Scanner;
public class FactorOfPalindrome {
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
        if (original == reverse) {
            System.out.println("Palindrome Number");
            System.out.println("Factors of " + original + " are:");

            // Corrected factor calculation
            for (int i = 1; i <= original / 2; i++) {
                if (original % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println(original); // Include the number itself as a factor
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
