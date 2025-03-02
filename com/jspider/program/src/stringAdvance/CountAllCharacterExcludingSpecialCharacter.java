
package com.jspider.program.src.stringAdvance;
import java.util.Scanner;
public class CountAllCharacterExcludingSpecialCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Taking input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char c1= input.charAt(i);
            if ((c1>=48 && c1<=57) || (c1>=97 && c1<=122) ||(c1>=65 && c1<=90))
                count++;
        }
        System.out.println("Total number of Character:"+count);

    }
}
