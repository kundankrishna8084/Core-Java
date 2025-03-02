package com.jspider.program.src.java8;
interface MyInterfaceOne{
    public void m1();
}

public class myApp implements MyInterfaceOne {
    @Override
    public void m1() {
        System.out.println("M1 method is called");
    }

    public static void main(String[] args) {
        myApp one = new myApp();
        one.m1();
    }
}
