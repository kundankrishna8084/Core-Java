
package com.jspider.program.src.number;
import java.util.Scanner;
public class FactorNumber {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter your number:");
        int n= scn.nextInt();
        int i=1;
        while(i<=n/2){
            if(n%i==0)
                System.out.println(i);
            i++;
        }

    }
}
