package com.jspider.program.src.operator;
import java.util.Scanner;
public class ThreeDigitNumberByTernary {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter three Digit Number");
        int n= scn.nextInt();

        String  big=(n>=100 && n<=999)? n+" Three digit number": n+ "Not three digit number";
        System.out.println(big);


        // If there are three number to check which is largest.
        int a= scn.nextInt();
        int b= scn.nextInt();
        int c=scn.nextInt();

        int z=a>b?a:b;
        int largest = z>c?z:c;
        System.out.println(largest+ " Is largest Number");

    }
}
