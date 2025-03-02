
package com.jspider.program.src.stringAdvance;
public class PrintSpaceCharacterInString {
    public static void main(String[] args) {
        String s1 = "Radha Krishna";

        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            if (c1==' '){
                System.out.println("Space index is:"+i);
            }
        }
    }
}
