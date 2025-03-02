
package com.jspider.program.src.DigitProblem;
public class SumOfEvenOrOddDigit {
    public static void main(String[] args) {
        int n = 5647841;
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println("Sum of digit is: "+sum);
        if (sum%2==0){
            System.out.println("Even sum");
        }else{
            System.out.println("Odd digit");
        }
    }
}
