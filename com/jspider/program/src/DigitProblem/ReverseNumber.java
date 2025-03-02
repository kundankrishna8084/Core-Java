
package com.jspider.program.src.DigitProblem;
public class ReverseNumber {
    public static void main(String[] args) {
        int n=5305;
        int rev=0;
        while(n>0){
            int rem=n%10;
            rev=10*rev+rem;
            n=n/10;
        }
        System.out.println("Reverse Number:"+rev);
    }
}
