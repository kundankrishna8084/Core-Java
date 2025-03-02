
package com.jspider.program.src.string;
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        /*
        //From start we reverse String
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter your String:");
            String s1 = scn.nextLine();
            String reverse=" ";
            int i=0;
            while (i<s1.length()){
                reverse=s1.charAt(i)+reverse;
                i++;
            }
             System.out.println("Reverse String is:"+reverse);
             */



        //From last, we reverse it
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your String:");
        String s1 = scn.nextLine();
        String reverse=" ";
        int i=s1.length()-1;
        while (i>=0){
            reverse=reverse+s1.charAt(i);
            i--;
        }
        System.out.println("Reverse String is:"+reverse);
        }

    }

