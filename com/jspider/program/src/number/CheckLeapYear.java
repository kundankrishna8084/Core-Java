package com.jspider.program.src.number;
import java.util.Scanner;
public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Year");
        int year =scn.nextInt();
//
//        // Check if the year is a century (divisible by 100)
//        if(year%100!=0){
//            // If not a century, check if it is divisible by 4
//            if(year%4==0)
//                System.out.println("This is leap year");
//            else
//                System.out.println("This is not leap year");
//        }else{
//            // If it is a century, check if it is divisible by 400
//            if(year%400==0)
//                System.out.println("This is leap year");
//            else
//                System.out.println(" This is not leap year");
//        }




        // 2nd ways to check leap year
        if(year%100!=0 && year%4==0 || year%400==0)
            System.out.println("This leap year");
        else
            System.out.println("This is not leap year");
    }
}
