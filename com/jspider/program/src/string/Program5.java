

package com.jspider.program.src.string;
public class Program5 {
    public static void main(String[] args) {
        String s1 = new String("Spring");
        s1.concat("fall");
        String s2 = s1.concat("Winter");
        s2.concat("Summer");
        System.out.println(s1);
        System.out.println(s2);
    }
}
