
package com.jspider.program.src.stringAdvance;
import java.util.Scanner;
public class CountAllLHCSCNC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int LowerCount=0;
        int UpperCount=0;
        int NumericCount=0;
        int specialCount=0;
        int spaceCount=0;
        System.out.println("Enter your String:");
        String input = scanner.nextLine();
        for (int i = 0; i <input.length(); i++) {
            char c1 = input.charAt(i);
            if(c1>=97 && c1<=122)
                LowerCount++;
            if(c1>=65 && c1<=90)
                UpperCount++;
            if(c1>=48 && c1<=57)
                NumericCount++;
            if(c1==32)
                spaceCount++;
            if(c1==33 || c1==36 || c1==64)
                specialCount++;
        }
        // Display results
        System.out.println("Lowercase Letters: " + LowerCount);
        System.out.println("Uppercase Letters: " + UpperCount);
        System.out.println("Numeric Characters: " + NumericCount);
        System.out.println("Spaces: " + spaceCount);
        System.out.println("Special Characters: " + specialCount);
    }
}
