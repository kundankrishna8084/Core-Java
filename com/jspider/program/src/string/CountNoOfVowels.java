
package com.jspider.program.src.string;
import java.util.Scanner;
public class CountNoOfVowels {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your String:");
        String s1=scn.nextLine();

        s1.toLowerCase();
        int count=0;
        int i=0;
        while(i<s1.length()){
            //Here we store String into character
            char x=s1.charAt(i);
            //Check character between the range
            if(x>=97 && x<=122){
                //yaha per check karege ki vowel na ho
                if((x=='a'|| x=='e' || x=='i' || x=='o' || x=='u'))
                   // phir count ko increase karege
                    count++;
            }
            i++;
        }
        System.out.println("Total Number of Vowels are: "+count);
    }
}
