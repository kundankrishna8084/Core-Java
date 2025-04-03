
package com.jspider.program.src.stringAdvance;
public class Program16 {
    public static void main(String[] args) {
        String s1 = "Mohan And Sohan Are Here";
        System.out.println("String Before Reverse:"+s1);
      reverseWords(s1);
    }
    public static void reverseWords(String s1) {
        String s2 ="";
        for (int i =s1.length()-1 ;i>=0 ;i--) {
            char c1 = s1.charAt(i);
            //Without space
            if (c1!=' '){
                s2=c1+s2;
            }
            // Space
            if((c1==' '|| i==0) && !s2.isBlank()){
                System.out.print(s2+" ");
                s2="";
            }

        }
    }
}
