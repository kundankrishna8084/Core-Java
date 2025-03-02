
package com.jspider.program.src.stringAdvance;
public class CountAllCharacterWithoutSpace {
    public static void main(String[] args) {
        String s1 = "Krishna mani test";
        int count =0;
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            if (c1 !=' ')
                count++;
        }
        System.out.println("Total Number of Character:"+count);
    }
}
