

package com.jspider.program.src.string;
public class Program2 {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("Kundan");
        StringBuffer sb2 = new StringBuffer("Kundan");
        System.out.println(sb1==sb2);
        System.out.println(sb1.equals(sb2));
    }
}
