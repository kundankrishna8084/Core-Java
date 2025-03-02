
package com.jspider.program.src.string;
import java.util.Scanner;
public class palindrome2ndWay {
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
    public  static boolean isPalindrome(String s1){
        // Convert the string to lowercase to make it case-insensitive
        s1=s1.toLowerCase();
        int mid=s1.length()/2;
        int i=0;
        // Compare characters from both ends
        while (i<mid){
            if (!(s1.charAt(i)==s1.charAt(s1.length()-1-i)))
                return false;
            i++;
        }
        // // If all characters match, the string is a palindrome
        return true;

    }
}
