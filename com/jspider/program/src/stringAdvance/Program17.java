
package com.jspider.program.src.stringAdvance;
public class Program17 {
    public static void main(String[] args) {
        String s1="Mohan And Sohan are Here";
        revereCharacter(s1);
    }
    private static void revereCharacter(String s1) {
        String s2="";
        for (int i = 0; i < s1.length(); i++) {
            char c1= s1.charAt(i);
            if (c1!=' '){
                s2=c1+s2;
            }
            if((c1==' ' ||i==s1.length()-1) && !s2.isBlank()){
                System.out.print(s2+" ");
                s2="";
            }
        }
    }
}
