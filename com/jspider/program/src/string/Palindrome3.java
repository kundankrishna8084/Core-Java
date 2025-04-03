package com.jspider.program.src.string;
public class Palindrome3 {
    public static boolean isPalindrome(String s1) {
        int n = s1.length();
        for (int i = 0; i < n / 2; i++) { // Loop only till half of the string
            if (s1.charAt(i) != s1.charAt(n - 1 - i)) {
                return false; // If mismatch found, it's not a palindrome
            }
        }
        return true; // If no mismatch, it's a palindrome
    }

    public static void main(String[] args) {
        String str = "kanak";
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}


