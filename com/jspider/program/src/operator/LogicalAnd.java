package com.jspider.program.src.operator;

public class LogicalAnd {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println(a++ > 8 && b++>10);//True
        System.out.println(a);//11
        System.out.println(b);//21

        int x=10;
        int y=20;
        System.out.println(x++ > 10 && y++ >15);//False
        System.out.println(x);//11
        System.out.println(y);//20


        int u=10;
        int t=20;
        System.out.println(u++>10 && t++>15);//False
        System.out.println(u);//11
        System.out.println(t);//21
    }
}
