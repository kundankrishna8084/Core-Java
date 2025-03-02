
package com.jspider.program.src.number;
public class SumOfNumberHalfEveryTime {
    public static void main(String[] args) {
        // Initialize the sum as a double to handle fractional values
        double sum=0.0;
        // Starting value of 'i' for the loop
        int i=1;
        // While loop to calculate the sum of the series 1 + 1/2 + 1/3 + ... + 1/100
        while(i<=100){
            // Add the reciprocal of the current value of 'i' to the sum
            sum=sum+(1.0/i);
            // Increment 'i' to move to the next number
            i++;
        }
        // Print the final calculated sum
        System.out.println("Sum of numbers are: "+sum);
    }
}
