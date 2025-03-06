
package com.jspider.program.src.string;
public class FindAplaInString {
    public static void main(String[] args) {
        String s1 ="Kundan907463K*&5444#45";
        String result=checkString(s1);
        System.out.println(result);
    }
    private static  String checkString(String s1){
        String s2 ="";
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            if(c1>=65 && c1<=90 || c1>=97 && c1<=122 )
                s2=s2+c1;
        }
        System.out.println(s2);
        return s2;
    }
}
