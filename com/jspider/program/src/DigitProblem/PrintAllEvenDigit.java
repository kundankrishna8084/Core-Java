
package com.jspider.program.src.DigitProblem;
public class PrintAllEvenDigit {
    public static void main(String[] args) {
        // Initialize the integer n with the value 564784
        int n=564784;
        // While loop runs until n becomes 0
        while(n>0){
            // Get the last digit (remainder when n is divided by 10)
            int reminder = n%10;
            // If the digit is even, print it
            if (reminder%2==0)
                System.out.println("All Even digit is:"+reminder);
            // Remove the last digit from n by performing integer division by 10.
            n=n/10;
        }
    }
}
