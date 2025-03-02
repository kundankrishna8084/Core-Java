
package com.jspider.program.src.DigitProblem;
public class ProductOfAllDigit {
    public static void main(String[] args) {
        int n= 564784;
        int product=1;
        while (n>0){
            int rem= n%10;
            product =product*rem;
            n=n/10;
        }
        System.out.println("Product of digit are: "+product);
        if(product%2==0)
            System.out.println("Even Product");
        else
            System.out.println("Odd product");

    }
}
