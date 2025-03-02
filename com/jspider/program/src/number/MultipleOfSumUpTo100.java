
package com.jspider.program.src.number;
public class MultipleOfSumUpTo100 {
    public static void main(String[] args) {
        int n=100;
        int i=1;
        int sum=0;
        // While loop to calculate the sum of products of consecutive integers
        while (i<=99){
            // Add the product of i and (i+1) to the cumulative sum
           sum=sum+i*(i+1);
            // Increment i to move to the next number
           i++;
        }
        // Print the final sum
        System.out.println("Sum of Numbers are: "+sum);
    }
}
