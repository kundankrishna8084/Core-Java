
package com.jspider.program.src.stringAdvance;
public class FascinatingNumber {
    public static void main(String[] args) {
        int num=192;
        if (isFascinating(num)) {
            System.out.println("Fascinating Number");
        }else{
            System.out.println("Not Fascinating Number");
        }
    }
    public static boolean isFascinating(int num){
        if (num<100)// Must be at least a 3-digit number
            return false;
        String s1= num +""+ (num*2) +(num*3);// Concatenate num, num*2, num*3
        if (s1.length()!=9)// Ensure it has 9 digits
            return false;
        int [] freq1= getFreqArray(s1);// Get frequency of digits
        // Check if digits 1-9 appear exactly once
        for (int i = 1; i <=9; i++) {
            if (freq1[i]!=1)
                return false;
        }
        return true;
    }
    public static int[] getFreqArray(String s) {
        s=s.toLowerCase();
        int[] freq = new int[10];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9')
                freq[c -'0']++;
        }
        return freq;
    }
}
