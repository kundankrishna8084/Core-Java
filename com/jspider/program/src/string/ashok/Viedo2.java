
package com.jspider.program.src.string.ashok;
public class Viedo2 {
    public static void main(String[] args) {
        String s1 = "$!Java@@Star%^";
        String plain=s1.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(plain);
    }
}
