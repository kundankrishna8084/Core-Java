
package com.jspider.program.src.stringAdvance;
public class Program30 {
    public static void main(String[] args) {
        String s1= "Dost Dost Na raha";
        maximumFrequency(s1);
    }
    public static void maximumFrequency(String s1) {
        int max=Integer.MIN_VALUE;
        char character='a';
        s1=s1.toLowerCase();
        int freq[] = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            char c1= s1.charAt(i);
            if(c1>=97 && c1<=122){
                freq[c1-97]++;
            }
        }
        for (int i = 0; i < freq.length; i++) {
            if(freq[i]>max){
                max=freq[i];
                character=(char)(i+97);
            }
        }
        System.out.println(character+" Maximum character appeared in String:" +max);

    }
}
