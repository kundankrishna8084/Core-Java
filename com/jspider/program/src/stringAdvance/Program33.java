
package com.jspider.program.src.stringAdvance;
public class Program33 {
    public static void main(String[] args) {
        String s1 ="32051";
        System.out.println(missingDigit(s1));
    }
    public static int missingDigit(String s1) {
        int [] freq=new int[10];
        for (int i = 0; i < s1.length(); i++) {
            char c1= s1.charAt(i);
            if(c1>='0' && c1<='9'){
                freq[c1-'0']++;
            }
        }
        for (int i = 0; i < freq.length; i++) {
            if(freq[i]==0)
               return i;
        }
        return -1;
    }
}
