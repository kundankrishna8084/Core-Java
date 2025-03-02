
package com.jspider.program.src.number;
public class MultipleSumOfSquareOnLeftSide {
    public static void main(String[] args) {
        int n=100;
        int i=1;
        int sum=0;
        // While loop to calculate the sum of i^2 * (i+1) for i ranging from 1 to 99
        while (i<=99){
            // Add the product of i^2 and (i+1) to the cumulative sum
            sum=sum+i*i*(i+1);
            // Increment i to move to the next number
            i++;
        }
        // Print the final sum
        System.out.println("Sum of Numbers are: "+sum);
    }
}
