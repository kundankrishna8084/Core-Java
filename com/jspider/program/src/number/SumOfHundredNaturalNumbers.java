
package com.jspider.program.src.number;
public class SumOfHundredNaturalNumbers {
    public static void main(String[] args) {
        /*int sum=0;
        int i=1;
        while(i<=100){
            sum=sum+i;
            i++;
        }
        System.out.println("Sum is:"+sum);

         */
        int n=100;
        int sum = n*(n+1)/2;
        System.out.println("Sum is:"+sum);
    }
}
