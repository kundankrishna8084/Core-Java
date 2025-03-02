package com.jspider.program.src.number;
import java.util.Scanner;
public class Program21 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x=scn.nextInt();
        int y = scn.nextInt();
        int big = getBig(x,y);
        System.out.println("Big of "+x+" and "+y+" is: "+big);
    }
    public static int getBig(int a, int b){
        if (a>b){
            System.out.println("A is grater than B");
            return a;
        }else {
            return b;
        }
    }


}
