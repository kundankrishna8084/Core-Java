package com.jspider.program.src.stringAdvance;

public class Problem26 {
    public static void main(String[] args) {
        String s1 = "Kundan@123test89";
        int count=0;
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            if(c1>=48 && c1<=57){
                count++;
            }
        }
        System.out.println("Total digit are: "+count);

    }
}
