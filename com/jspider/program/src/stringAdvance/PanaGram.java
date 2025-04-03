
package com.jspider.program.src.stringAdvance;

public class PanaGram {
    public static void main(String[] args) {
        //String s1="The quick brown fox jumps over the lazy dog";
        String s1="Pack my box with five dozen liquor jugs.";
        if (isPanagram(s1)) {
            System.out.println("This is  panagram");
        }else {
            System.out.println("This is not Panagram");
        }
    }
    public static boolean isPanagram(String s1){
        if (s1.length()<26){
            return false;
        }
        int [] freq1=getFreqArray(s1);
        for (int i = 0; i < freq1.length; i++) {
            if(freq1[i]<1)
                return false;
        }
        return true;
    }
    public static int[] getFreqArray(String s) {
        s=s.toLowerCase();
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z')
                freq[c -'a']++;
        }
        return freq;
    }
}
