
package com.jspider.program.src.string.ashok;
import java.util.Arrays;
public class CharacterWithOccurence {
    public static void main(String[] args) {
        String s1= "opentext";
        char ch = 't';
        //Check character present in String
        if (s1.indexOf(ch)==-1){
            System.out.println("Given Character is not present in String:");
            System.exit(0);
        }

        // Logic to replace character occurrence in String
        int countChar=1;
        for (int i = 0; i < s1.length(); i++) {
            char ch1 = s1.charAt(i);
            if(ch1==ch){
                s1=s1.replaceFirst(String.valueOf(ch),String.valueOf(countChar));
            }
        }
        System.out.println(s1);



        /*
        int countChar=1;
        char [] arr = s1.toCharArray();// o p e n t e x t
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==ch){
                arr[i]=String.valueOf(countChar).charAt(0);
                countChar++;
            }
        }
        System.out.println(Arrays.toString(arr));

         */
    }
}
