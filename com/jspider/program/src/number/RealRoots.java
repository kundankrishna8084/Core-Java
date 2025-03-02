package com.jspider.program.src.number;
import java.util.Scanner;
public class RealRoots {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in) ;
        System.out.println("Enter Your number");
        int a=scn.nextInt();
        int b= scn.nextInt();
        int c=scn.nextInt();

        double d = b*b-4*a*c;
        if(d>0){
            System.out.println("Real root are Possible");
            double p=(-b+Math.sqrt(d))/(2*a);
            double q=(-b-Math.sqrt(d))/(2*a);

            System.out.println("1st root is:" +p);
            System.out.println("2nd root is: " +q);
        }else {
            System.out.println("Real root are not possible");
        }
    }
}
