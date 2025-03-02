
package com.jspider.program.src.string;
import java.util.Scanner;
public class ReverseCharacterOneByOne {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your String:");
        String s1 = scn.nextLine();
        int i=s1.length()-1;
        while (i>=0){
            System.out.println("Character are:"+s1.charAt(i));
            i--;
        }
    }
}
