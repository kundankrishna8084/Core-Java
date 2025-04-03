
package com.jspider.program.src.stringAdvance;
public class CountWords {
    public static void main(String[] args) {
        //String s1 ="Mohan and Sohan are here";
        String s1 =" Mohan and Sohan are Here ";
        int count=0;
        for (int i = 0; i < s1.length(); i++) {
            char c1=s1.charAt(i);
            if ((i == 0 && c1 != ' ') || (i > 0 && s1.charAt(i - 1) == ' ' && c1 != ' '))
                count++;
        }
        System.out.println("Total words are:" + count);

    }
}
