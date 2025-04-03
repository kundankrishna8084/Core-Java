
package com.jspider.program.src.stringAdvance;
public class Program22 {
    public static void main(String[] args) {
        String s1 = "mohan And Sohan Are Here";
//        s1=s1.toUpperCase();
//        System.out.println(s1);
        upperCase(s1);
    }

    private static void upperCase(String s1) {
        String result ="";
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (c>='a' && c<='z'){
                result = result+(char)(c-32);
            }else {
                result=result+c;
            }
        }
        System.out.println(result);
    }

}
