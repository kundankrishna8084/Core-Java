
package com.jspider.program.src.DigitProblem;
public class CountDigitInNumber {
    public static void main(String[] args) {
        int n=564784;
        int count=0;
        // While loop runs until n becomes 0
        while(n>0){
            // Get the last digit (remainder when n is divided by 10)
            int reminder = n%10;
            count++;
            // Remove the last digit from n by performing integer division by 10.
            n=n/10;
        }
        System.out.println("Total Number is: "+count);
    }
}
