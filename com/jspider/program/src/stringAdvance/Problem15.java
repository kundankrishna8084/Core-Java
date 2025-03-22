package com.jspider.program.src.stringAdvance;

public class Problem15 {
    public static void main(String[] args) {
        String s1 = "Radhe Radhe ";


        int count=0;
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            if (i==0 && c1!=' ' || c1!=' ' && s1.charAt(i-1)==' '){
                count++;
            }
        }
        System.out.println("Total number of words are:"+count);
    }
}
