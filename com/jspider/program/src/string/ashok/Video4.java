

package com.jspider.program.src.string.ashok;
import java.util.LinkedHashSet;
import java.util.Set;
public class Video4 {
    public static void main(String[] args) {
        String str= "Programming";

        //Approach-1
        //Using Java8
        /*
        StringBuilder sb = new StringBuilder();
        str.chars().distinct().forEach(c->sb.append((char)c));
        System.out.println(sb);//Progamin

         */


        // Approach -2
        //Using indexOf(--)
        /*
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            int index = str.indexOf(ch,i+1);
            if (index==-1){
                sb.append(ch);
            }
        }
        System.out.println(sb);//Poraming


         */


        // Approach -3
        //Using Character Array
        /*
        char [] arr = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            boolean repated=false;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    repated=true;
                    break;
                }
            }
            if (!repated){
                sb.append(arr[i]);
            }

        }
        System.out.println(sb);//Poraming

         */

        // Approach -4
        //Using Set Interface Method
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        for (Character c:set){
            sb.append(c);
        }
        System.out.println(sb);//Progamin

    }
}
