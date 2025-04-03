
package com.jspider.program.src.stringAdvance;
public class Program44 {
    public static void main(String[] args) {
        String s1 = "abcdefgh";
        exchangeCharacter(s1);
    }
    private static void exchangeCharacter(String s1) {
        String replace = "";
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            if (i < s1.length() - 1 && c1 == 'c' && s1.charAt(i + 1) == 'd') {
                replace = replace + "fg"; // Replace "cd" with "fg"
                i++; // Skip the next character 'd'
            } else {
                replace = replace + c1;
            }
        }
        System.out.println( "Replace String is: "+replace);
    }
}
