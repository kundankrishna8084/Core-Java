
package com.jspider.program.src.DigitProblem;
public class DifferenceBetweenReverseOrOriginalNumber {
    public static void main(String[] args) {
        int n=5305;
        int original=n;
        int diff=0;
        int rev=0;
        while (n>0){
            int rem=n%10;
            rev=10*rev+rem;
            n=n/10;
        }
        // Calculate the difference
         diff = Math.abs(original - rev); // Use absolute value

        // Print results
        System.out.println("Original Number: " + original);
        System.out.println("Reversed Number: " + rev);
        System.out.println("Difference is: " + diff);

    }
}
