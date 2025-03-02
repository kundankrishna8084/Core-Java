package com.jspider.program.src.oops.variableShadowing;

public class StaticVariableShadowing {
     static int x =48;
    public static void test(){
        System.out.println("Test Method");
        int  y=98;
        System.out.println("Local Variable:"+y);
        // we can call static variable by using class name as reference
        System.out.println("Static Variable:"+StaticVariableShadowing.x);
    }

    public static void main(String[] args) {
        test();
    }
}
