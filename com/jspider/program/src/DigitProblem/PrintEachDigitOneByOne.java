
package com.jspider.program.src.DigitProblem;
public class PrintEachDigitOneByOne {
    public static void main(String[] args) {
        // Initialize the integer n with the value 564784
        int n=564784;

        while(n>0){
            //Get the last digit (remainder when n is divided by 10)
            int reminder = n%10;
            System.out.println("Each digit is: " +reminder);
            //// Remove the last digit from n by performing integer division by 10.
            n=n/10;
        }
    }
}
