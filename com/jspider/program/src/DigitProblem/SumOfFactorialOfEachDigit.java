
package com.jspider.program.src.DigitProblem;
public class SumOfFactorialOfEachDigit {
    public static void main(String[] args) {
        int n=564784;
        int sum=0;
        while (n>0){
            int rem = n % 10; // Get last digit
            int fact = 1;  // Reset fact for each digit
            // Compute factorial of the digit
            for (int i = 1; i <=rem; i++) {
                fact=fact*i;
            }
            System.out.println("Factorial of " + rem + " is: " + fact);
            sum=sum+fact;
            n /= 10; // Remove last digit
        }
        System.out.println("Sum of factorial of each digit: " + sum); // Print final sum
    }
}
