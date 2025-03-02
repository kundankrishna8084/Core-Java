
package com.jspider.program.src.number;
import java.util.Scanner;
public class CountFactor {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter your number:");
        int n= scn.nextInt();
        int i=1;
        int count=0;
        while(i<=n/2) {
            if (n % i == 0) {
                System.out.println(i);
                count++;
            }
            i++;
        }
        System.out.println("Total factor are:"+count);
    }
}
