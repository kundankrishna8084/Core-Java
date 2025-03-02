package com.jspider.program.src.number;

import java.util.Scanner;
public class Program20 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //Case 1
        String name = scn.nextLine();
        int age =scn.nextInt();
        double weight =scn.nextDouble();

        // Case 2
        System.out.println("Enter your age");
        int age1= scn.nextInt();
        System.out.println(age1);

        System.out.println("Enter Your Name");
        scn.nextLine();
        // nextLine () cursor ko  bhi accept karta hai
        // and another method can not accept the cursor
        String name1= scn.nextLine();
        System.out.println(name1);

        System.out.println("Enter your Weight");
        double weight1 = scn.nextDouble();
        System.out.println(weight1);

        System.out.println("enter your pin");
        int pin =scn.nextInt();
        System.out.println(pin);

        System.out.println("Enter your country");
        scn.nextLine();
        String country =scn.nextLine();
        System.out.println(country);

        System.out.println("Enter your Email");
        String email=scn.nextLine();
        System.out.println(email);

        System.out.println("Enter your Lang");
        String lang =scn.nextLine();
        System.out.println(lang);
    }
}
