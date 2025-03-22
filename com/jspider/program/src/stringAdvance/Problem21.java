
package com.jspider.program.src.stringAdvance;
public class Problem21 {
    public static void main(String[] args) {
        String s1 ="Mohan and sohan are here";
        String rev="";
        int count=0;
        for (int i =0; i <s1.length(); i++) {
            char c1 = s1.charAt(i);
            if (c1!=' '){
                rev=rev+c1;
            }
            if ((c1==' ' || i==s1.length()-1) && !rev.isBlank()){
                if (rev.length()%2==0){
                    count++;
                }
                rev="";
            }
        }
        System.out.println("Total Number of Even Words:"+count);
        }
    }

