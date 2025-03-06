package com.jspider.program.src.string;

public class CountWords {
    public static void main(String[] args) {
        String s1 = "Kundan is my Name";
        String s2=" Kundan is my name";
        String s3 = "Kundan is my name ";
        String s4 =" Kundan is my name ";
        int result = checkWords(s4);
        System.out.println("total words are:"+result);
    }

    private  static  int checkWords(String s1){
        int count =0;

        for (int i = 0; i < s1.length(); i++) {
            char c1= s1.charAt(i);
            if(c1==32){
                count++;
            }

        }
        return  count;
    }

}
