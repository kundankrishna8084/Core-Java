
package com.jspider.program.src.string;
public class AddStringNumber {
    public static void main(String[] args) {
        String s1= "Test783490";
        int result=sum(s1);
        System.out.println("Sum of number:"+result);
    }
    private static  int sum(String s1){
        int sum=0;
        int count =0;
        for (int i = 0; i < s1.length(); i++) {
            char c=s1.charAt(i);
            if (c>=48 && c<= 57){
                sum= sum+c-48;
                count++;
            }
        }
        System.out.println("Total number of Character:"+count);
         return  sum;
    }
}
