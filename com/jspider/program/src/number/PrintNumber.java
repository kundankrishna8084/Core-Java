package com.jspider.program.src.number;

public class PrintNumber {
    public static void main(String[] args) {
           printDigit();
    }
    public static void printDigit(){
        int x=873;
        System.out.println("The first digit is: "+x%10);
        x=x/10;
        System.out.println("The Second digit is: "+x%10);
        x=x/10;
        System.out.println("The third digit is :"+x%10);

    }
}
