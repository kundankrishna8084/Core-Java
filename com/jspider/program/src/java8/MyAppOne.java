package com.jspider.program.src.java8;
@FunctionalInterface
interface MyInterface{
    public void m2();
}

public class MyAppOne  {
    public static void main(String[] args) {
       MyInterface m1 = ()-> System.out.println("M2 method called");
       m1.m2();
    }

}
