package com.jspider.program.src.stringAdvance;

public class SumOfNumericCharacter {
    public static void main(String[] args) {
        String s1 = "Krishna12345Test";
        int sum=0;
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            if(c1>=48 && c1<=57){
               sum=sum+c1-48;
            }
        }
        System.out.println("Sum of NumericCharacter is: "+sum);
        
    }

}
