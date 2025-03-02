package com.jspider.program.src.number;
import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your Number");
        int n =scn.nextInt();
        // We can make with conditional operator
        String result=(n%2==0)? n+" is Even Number":n+" is Odd Number";
        System.out.println(result);
//        if(n%2==0){
//            System.out.println("Even Number");
//        }else{
//            System.out.println("Odd Number");
//        }
    }
}
