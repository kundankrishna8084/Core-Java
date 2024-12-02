package com.jspider.program.src.exceptionHandling;
import java.util.*;
public class RegistrationDriver {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter age: ");
        int age=scn.nextInt();
        try {
            Registration.checkEligiblity(age);
        } catch (UnderAgeException e) {
            System.out.println("Message is: "+e.getMessage());
            System.out.println(e);
            e.printStackTrace();
        }
        System.out.println("Program Ends!!");
    }
}
