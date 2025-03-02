package com.jspider.program.src.operator;

import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the side of Triangle");
        int a = scn.nextInt();
        int b= scn.nextInt();
        int c= scn.nextInt();

        String valid=(a+b>c && b+c>a && c+a>b)?"Valid triangle":"Invalid Triangle";
        System.out.println(valid);
    }
}
