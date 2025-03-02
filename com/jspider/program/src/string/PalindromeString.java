
package com.jspider.program.src.string;
import java.util.Scanner;
public class PalindromeString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your String:");
        String s1 = scn.nextLine();

        // Call the isPalindrome method and print the result
        if (isPalindrome(s1)) {
            System.out.println("String is a palindrome");
        } else {
            System.out.println("String is not a palindrome");
        }
    }

    public static boolean isPalindrome(String s1) {

        String reverse = "";
        int i = 0;
        while (i <= s1.length()-1) {
            reverse = s1.charAt(i) + reverse;
            i++;
        }
        System.out.println("Reverse String is:" + reverse);
        return s1.equalsIgnoreCase(reverse);
    }

}