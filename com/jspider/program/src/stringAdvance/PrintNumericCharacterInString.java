
package com.jspider.program.src.stringAdvance;
public class PrintNumericCharacterInString {
    public static void main(String[] args) {
        String s1 = "Krishna123290@";

        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            if (c1>=48 && c1<=57){
                System.out.println("Numeric Character is:"+i);
            }
        }
    }
}
