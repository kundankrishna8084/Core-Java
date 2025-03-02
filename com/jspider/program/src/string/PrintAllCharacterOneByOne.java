
package com.jspider.program.src.string;
import java.util.Scanner;
public class PrintAllCharacterOneByOne {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your String:");
        String s1 = scn.nextLine();
        int i=0;
        while (i<s1.length()){
            System.out.println("Character are:"+s1.charAt(i));
            i++;
        }
    }
}
