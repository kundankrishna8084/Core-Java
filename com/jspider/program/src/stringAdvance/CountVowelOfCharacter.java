
package com.jspider.program.src.stringAdvance;
import java.util.Scanner;
public class CountVowelOfCharacter {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String input=scn.nextLine();
        input.toLowerCase();
        int count=0;

        for (int i = 0; i < input.length(); i++) {
            char c1 = input.charAt(i);
            if(c1>=97 && c1<=122){
                //yaha per check karege ki vowel na ho
                if(c1=='a'|| c1=='e' || c1=='i' || c1=='o' || c1=='u')
                    // phir count ko increase karege
                    count++;
            }
        }
        System.out.println("Total Number of Vowel:"+count);
    }
}
