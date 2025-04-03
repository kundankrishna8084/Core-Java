
package com.jspider.program.src.stringAdvance;
public class Program28 {
    public static void main(String[] args) {
        String s1 = "Dost Dost Na Raha";
        frequencyOfEachCharacter(s1);
    }
    public static void frequencyOfEachCharacter(String s1) {
        s1=s1.toLowerCase();
        int freq[] = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            char c1= s1.charAt(i);
            if (c1>=97 && c1<=122){
                freq[c1-97]++;
            }
        }
        for (int i = 0; i < freq.length; i++) {
            if(freq[i]>=1)
                System.out.println((char)(i+97)+" : "+freq[i]+" Times");
        }
    }
}
