
package com.jspider.program.src.stringAdvance;
public class Program19 {
    public static void main(String[] args) {
        String s1 = "kundan And Ashmit Are friends";
        largestString(s1);
    }
    private static void largestString(String s1) {
        String s2="";
        String largest="";
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            if(c1!=' '){
                s2=s2+c1;
            }
            if((c1==' ' || i==s1.length()-1) && !s2.isBlank()){
                if (s2.length()>largest.length()){
                    largest=s2;
                }
                s2="";
            }
        }
        System.out.println("Largest String is: "+largest);
    }
}
