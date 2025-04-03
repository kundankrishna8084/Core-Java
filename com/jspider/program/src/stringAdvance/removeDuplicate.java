
package com.jspider.program.src.stringAdvance;
public class removeDuplicate {
    public static void main(String[] args) {
        String s1 = "TestTest";
        String s2 ="";

        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            if (!s2.contains(c1+"")){
                s2=s2+c1;

            }
        }
        System.out.println("new String without duplicate:-"+s2);


    }
}
