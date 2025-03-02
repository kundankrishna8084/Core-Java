package com.jspider.program.src.constructor;

public class StaticBlock {
    static int x=34;
    static int y;

    static {
        System.out.println("Static block-1:");
        System.out.println(x+" "+y);
        x=90;
        int y=50;
        System.out.println(x+" "+y);
    }

    public static void main(String[] args) {
        System.out.println("This is main method");
    }
    public static void test(){
        System.out.println("Test Method:" +x+" "+y);
        int y=68;
        System.out.println(x+" "+y);
    }
    static {
        System.out.println("Static block-2");
        test();
    }

}
