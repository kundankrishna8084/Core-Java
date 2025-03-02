package com.jspider.program.src.number;
import java.util.Scanner;
public class PrintThreeDigitNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your Number");
        int n =scn.nextInt();
//        String result=(n>=100 && n<=999)?n+ " This is three digit number":n+" This is not three digit number";
//        System.out.println(result);

        if (n>99 && n<=999){
            System.out.println("Three digit Number");
        }else{
            System.out.println("Not three digit number");
        }

    }
}
