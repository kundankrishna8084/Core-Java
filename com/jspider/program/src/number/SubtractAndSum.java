
package com.jspider.program.src.number;
public class SubtractAndSum {
    public static void main(String[] args) {
        int sum=0;
        int i=1;
        // While loop to calculate the sum where odd numbers are added and even numbers are subtracted
        while(i<=100){
            // If i is odd, add i to sum
            if(i%2==1)
                sum=sum+i;
                // If i is even, subtract i from sum
            else
                sum=sum-i;
            i++;
        }
        System.out.println("Sum of number are: "+ sum);
    }
}
