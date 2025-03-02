
package com.jspider.program.src.DigitProblem;
public class CountOddDigit {
    public static void main(String[] args) {
        int n=564784;
        int count=0;
        // While loop runs until n becomes 0
        while(n>0){
            // Get the last digit (remainder when n is divided by 10)
            int reminder = n%10;
            if(reminder%2!=0) {
                count++;// Increment count if the digit is odd

            }

            // Remove the last digit from n by performing integer division by 10.
            n=n/10;
        }
        // After processing all digits, print the total count of even digits
        System.out.println("Total odd digits: " + count);

    }
}
