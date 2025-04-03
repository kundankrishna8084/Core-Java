
package com.jspider.program.src.stringAdvance;
public class Program20 {
    public static void main(String[] args) {
        String s1="Dost Dost Na Raha";
        System.out.println(indexOfNonRepeating(s1));
    }
    public static int indexOfNonRepeating(String s1) {
        s1=s1.toLowerCase();
        int [] freq= new int[26];
        for (int i = 0; i < s1.length(); i++) {
            char c1= s1.charAt(i);
            if(c1>=97 && c1<=122){
                freq[c1-97]++;
            }
        }
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            if (c1 >= 97 && c1 <= 122 && freq[c1 - 97] == 1) {
                return i;
            }
        }
        return -1;
    }
}
