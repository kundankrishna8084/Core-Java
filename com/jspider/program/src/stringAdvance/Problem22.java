package com.jspider.program.src.stringAdvance;

public class Problem22 {
    public static void main(String[] args) {
        String s1 = "Kundan And Ashmit are Talking to each other";
        String word="";
        String largest="";

        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            if (c1!=' '){
                word=word+c1;
            }
            if ((c1==' ' || i==s1.length()-1) && !word.isBlank()){
                if (word.length()>largest.length()){
                    largest=word;
                }
                word="";
           }
        }
        System.out.println("Largest String is: " +largest);
    }
}
