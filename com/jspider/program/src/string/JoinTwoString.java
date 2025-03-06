
package com.jspider.program.src.string;
import java.util.Scanner;
public class JoinTwoString {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter first String:");
        String s1 = scn.nextLine();
        System.out.println("Enter second String:");
        String s2 = scn.nextLine();

        String result = s1+ " "+s2;
        System.out.println("Join of Two String: "+result);
    }
}
