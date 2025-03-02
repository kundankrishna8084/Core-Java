
package com.jspider.program.src.DigitProblem;
public class DifferenceBiggestAndSmallest {
    public static void main(String[] args) {
        int n= 564784;
        int big=Integer.MIN_VALUE;
        int small=Integer.MAX_VALUE;
        while(n>0){
            int remainder=n%10;// Get last digit
            /*
            if(big<remainder) {
                big = remainder;
            }
            if(small>remainder){
                small=remainder;
            }

             */

            big = Math.max(big, remainder);   // Update biggest digit
            small = Math.min(small, remainder); // Update smallest digit
            n=n/10;// Every time it Remove last digit
        }
        System.out.println("Biggest digit is: " +big);
        System.out.println("Smallest digit is: "+small);
        System.out.println("Difference between Biggest and smallest  digit is: "+ (big-small));
    }
}
