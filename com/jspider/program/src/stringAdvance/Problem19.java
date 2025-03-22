package com.jspider.program.src.stringAdvance;

public class Problem19 {
    public static void main(String[] args) {
        String s1 = "Sohan and Mohan are Here";
        String rev="";

        for (int i = s1.length()-1; i >=0; i--) {
            char c1 = s1.charAt(i);
            if (c1!=' '){
                rev=c1+rev;
            }
            if ((c1==' ' || i==0) && !rev.isBlank()){
                System.out.print(rev+" ");
                rev="";

            }

        }
    }
}
