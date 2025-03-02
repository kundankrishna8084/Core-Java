
package com.jspider.program.src.DigitProblem;
public class DivisibleBy5OrNot {
    public static void main(String[] args) {
        int n=5305;
        int original=n;
        int rev=0;
        while (n>0){
            int rem=n%10;
            rev=10*rev+rem;
            n=n/10;
        }
        System.out.println("Reverse Number "+rev);
        System.out.println("Original Number: "+original);
        if(original%5==0 && rev%5==0){
            System.out.println("Divisible by 5");
        }
        else{
            System.out.println("Not Divisible by 5");
        }
    }
}
