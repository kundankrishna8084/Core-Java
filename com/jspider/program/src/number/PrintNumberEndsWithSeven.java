package com.jspider.program.src.number;
import java.util.Scanner;
public class PrintNumberEndsWithSeven {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your starting  Number");
        int start=scn.nextInt();
        System.out.println("Enter the end Number");
        int end=scn.nextInt();

//        for (int i = start; i <end ; i++) {
//            if(i%10==7)
//                System.out.println(i+ " ");
//
//        }


        int i=start;
        while(i<end){
            if (i%10==7)
                System.out.println(i+" ");
            i++;
        }

    }
}
