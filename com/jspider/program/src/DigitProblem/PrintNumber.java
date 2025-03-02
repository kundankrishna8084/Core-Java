
package com.jspider.program.src.DigitProblem;
public class PrintNumber {
    public static void main(String[] args) {
        int n = 564784;
        while (n > 0) {
            int rem = n % 10;  // Extract last digit
            System.out.print(rem + " ");  // Print the digit
            n = n / 10;  // Remove last digit
        }
    }
}
