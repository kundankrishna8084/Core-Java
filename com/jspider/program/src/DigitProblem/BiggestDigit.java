
package com.jspider.program.src.DigitProblem;
public class BiggestDigit {
    public static void main(String[] args) {
        int n= 564784;
        int big=Integer.MIN_VALUE;
        while(n>0){
            int remainder=n%10;// Get last digit
            if(big<remainder){
                big=remainder;// Update largest digit
            }
            n=n/10;// Every time it Remove last digit
        }
        // Print the final largest digit
        System.out.println("Biggest digit is: "+big);
    }
}
