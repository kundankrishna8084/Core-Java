
package com.jspider.program.src.stringAdvance;
import java.util.Arrays;
public class Anagram1 {
    public static void main(String[] args) {
        String s1 = "Silent";
        String s2 = "Listen";
        s1=s1.toLowerCase();
        s2= s2.toLowerCase();
        char [] c1 =s1.toCharArray();
        char[]  c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(c1.length!=c2.length){
            System.out.println("This is not AnaGram");
        }else {
            for (int i = 0; i < c1.length; i++) {
                if(c1[i]==c2[i]){
                    System.out.println("This is AnaGram");
                }
                break;
            }
        }
    }
}
