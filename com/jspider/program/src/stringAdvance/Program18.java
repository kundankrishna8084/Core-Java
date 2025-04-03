
package com.jspider.program.src.stringAdvance;
public class Program18 {
    public static void main(String[] args) {
        String s="Mohan And Sohan Are Here";
        evenWords(s);
    }
    public static void evenWords(String s) {
        String word="";
        int count=0;
        for(int i=0;i<s.length();i++) {
            char c=s.charAt(i);
            if(c!=' ')
                word=word+c;
            if((c==' '|| i==s.length()-1) && !word.isBlank()) {

                if(word.length()%2==0) {
                    System.out.println(word+" is of even length");
                    count++;
                }
                word="";
            }
        }

        System.out.println("Total even count words are:"+count);
    }
}

