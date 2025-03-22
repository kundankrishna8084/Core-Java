package com.jspider.program.src.string;

public class Program6 {
    public static void main(String[] args) {
        String s1 = new String("You can,t change me");
        String s2 = new String("You can,t change me");
        System.out.println(s1==s2);

        String s3 ="You can,t change me";
        System.out.println(s1==s3);

        String s4 = "You can,t change me";
        System.out.println(s3==s4);

        String s5="you can,t" + "change me";
        System.out.println(s4==s5);

        String s6 ="you can,t";
        String s7 = s6+"change me";
        System.out.println(s4==s7);

        final String s8="you can,t";
        String s9 = s8+" change me";
        System.out.println(s4==s9);
    }
}
