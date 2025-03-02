package com.jspider.program.src.DigitProblem;

public class PrintDigitGreaterThan5 {
    public static void main(String[] args) {
        int n=564784;
        // While loop runs until n becomes 0
        while(n>0){
            // Get the last digit (remainder when n is divided by 10)
            int reminder = n%10;
            //Check here greater than 5
            if(reminder>5)
                System.out.println(reminder);
            // Remove the last digit from n by performing integer division by 10.
            n=n/10;
        }
    }
}
