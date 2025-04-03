
package com.jspider.program.src.stringAdvance;
public class Program35 {
    public static void main(String[] args) {
        String s1= "mohan And Sohan ";
        printFirstCharacter(s1);
    }
    private static void printFirstCharacter(String s1) {
        String s2 ="";
        for (int i = 0; i < s1.length(); i++) {
            char c1=s1.charAt(i);
            if(i==0 && c1!=' '){
                s2=s2+c1;
                System.out.println(s2);
            }
            if (i>0 && s1.charAt(i-1)==' '){
                s2=s2+c1;
                System.out.println(s2);
            }
            s2="";
        }
    }
}
