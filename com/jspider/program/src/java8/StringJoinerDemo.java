package com.jspider.program.src.java8;

import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner( "-");
        sj.add("Kundan");  sj.add("Developer");
        sj.add("Java full stack"); sj.add("Bihar");

        System.out.println(sj);

        StringJoiner sj2 = new StringJoiner("-","(",")");
        sj2.add("Kundan");  sj2.add("Developer");
        sj2.add("Java full stack"); sj2.add("Bihar");
        System.out.println(sj2);
    }
}
