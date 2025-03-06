
package com.jspider.program.src.string;
public class ConvertIntoUpperCase {
    public static void main(String[] args) {
        String s1 = "Kundan";
        String result =UpperCase(s1);
        System.out.println(result);
    }
    public static String UpperCase(String s1){
        char [] c1 = s1.toCharArray();
        for (int i = 0; i <c1.length ; i++) {
            if(c1[i]>=97 && c1[i]<=122){
                c1[i]= (char) (c1[i]-32);
            }
        }
        return String.valueOf(c1);
    }
}
