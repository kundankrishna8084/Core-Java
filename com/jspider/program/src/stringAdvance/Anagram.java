package com.jspider.program.src.stringAdvance;
public class Anagram {
    public static void main(String[] args) {
        String s1 = "Kundan ";
        String s2 = "Krishna";
        if(isAnagram(s1,s2)){
            System.out.println("Anagram");
        }else
            System.out.println("not anagram");
    }
        public static boolean isAnagram(String s1, String s2) {

        if(s1.length()!=s2.length())
           return false;
            int[] freq1=getFreqArray(s1);
            int[] freq2=getFreqArray(s2);

            for(int i=0;i<freq1.length;i++){
                if(freq1[i]!=freq2[i])
                    return false;
            }
            return true;
        }
        public static int[] getFreqArray (String s) {

            int[] freq = new int[26];
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c >= 65 && c <= 90)
                    freq[c - 65]++;
              else  if (c >= 97 && c <= 122)
                    freq[c - 97]++;
            }
          return freq;
        }
}
