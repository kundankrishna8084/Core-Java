package com.jspider.program.src.number;

public class SumOfNumberWhichIsMultipleUpTo100 {
    public static void main(String[] args) {
        int i=1;
        int sum=0;
        while(i<=99){
            sum=sum+i*(i+1);
            i++;
        }
        System.out.println("Sum is:"+sum);
    }
}
