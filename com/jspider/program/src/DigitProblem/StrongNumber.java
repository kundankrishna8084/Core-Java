
package com.jspider.program.src.DigitProblem;
public class StrongNumber {
     public static void main(String[] args) {
        int n=145;
        int sum=0;
        int temp=n;

         while(n>0){
             int rem=n%10;
             int fact=1;
             for (int i =1; i <=rem ; i++) {
                 fact=fact*i;
             }
             sum=sum+fact;
             n=n/10;
         }
         System.out.println("Sum is:"+sum);
         if(sum==temp)
             System.out.println("This is Strong Number");
         else
             System.out.println("This is not Strong number");
    }
}
